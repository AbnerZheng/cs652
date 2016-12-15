package cs652.j.semantics;

import com.sun.org.apache.xpath.internal.operations.Variable;
import cs652.j.parser.JBaseListener;
import cs652.j.parser.JParser;
import org.antlr.symtab.*;
import org.antlr.v4.runtime.ParserRuleContext;

public class DefineScopesAndSymbols extends JBaseListener {
    public Scope currentScope;

    public DefineScopesAndSymbols(GlobalScope globals) {
        currentScope = globals;
        defineGlobalPrimitiveType();
    }

    @Override
    public void enterFile(JParser.FileContext ctx) {
        ctx.scope = (GlobalScope) currentScope;
    }

    @Override
    public void enterClassDeclaration(JParser.ClassDeclarationContext ctx) {
        final String className = ctx.ID().getText();
        final JClass jClass = new JClass(className, ctx);
        if(ctx.typeType()!=null){
            final String superClass =  ctx.typeType().getText();
            jClass.setSuperClass(superClass);
        }
        currentScope.define(jClass);
        ctx.scope = jClass;
        pushScope(jClass);
    }



    @Override
    public void exitClassDeclaration(JParser.ClassDeclarationContext ctx) {
        popScope();
    }

    @Override
    public void enterStatementOfMain(JParser.StatementOfMainContext ctx) {
        final MainScope mainScope = new MainScope(currentScope);
        currentScope.nest(mainScope);
        pushScope(mainScope);
        final LocalScope localScope = new LocalScope(currentScope);
        currentScope.nest(localScope);
        ctx.scope = localScope;
        pushScope(localScope);
    }

    @Override
    public void exitStatementOfMain(JParser.StatementOfMainContext ctx) {
        popScope();
        popScope();
    }


    @Override
    public void enterLabelOfAssign(JParser.LabelOfAssignContext ctx) {
        super.enterLabelOfAssign(ctx);
    }

    @Override
    public void enterVariableDeclaration(JParser.VariableDeclarationContext ctx) {
        VariableSymbol v = new VariableSymbol(ctx.ID().getText());
        v.setType((Type) currentScope.resolve(ctx.typeType().getText()));
        currentScope.define(v);
    }

    @Override
    public void enterFieldsDeclaration(JParser.FieldsDeclarationContext ctx) {
        final FieldSymbol fieldSymbol = new FieldSymbol(ctx.ID().getText());
        fieldSymbol.setType((Type) currentScope.resolve(ctx.typeType().getText()));
        currentScope.define(fieldSymbol);
    }

    @Override
    public void enterBlock(JParser.BlockContext ctx) {
        final LocalScope localScope = new LocalScope(currentScope);
        currentScope.nest(localScope);
        pushScope(localScope);
        ctx.scope = localScope;
    }

    @Override
    public void exitBlock(JParser.BlockContext ctx) {
        popScope();
    }

    @Override
    public void enterLabelMethod(JParser.LabelMethodContext ctx) {
        final String methodName = ctx.ID().getText();
        final JMethod jMethod = new JMethod(methodName, ctx);
        // 设置method的类别
        final String typeText = ctx.typeType().getText();
        final Symbol type = currentScope.resolve(typeText);
        jMethod.setType((Type) type);
        final ClassSymbol jClass =  getEnclosingClass(currentScope);
        final String jClassName = jClass.getName();
        // 类里的每个method都有this
        final VariableSymbol aThis = new VariableSymbol("this");
        aThis.setType((Type) currentScope.resolve(jClassName));
        jMethod.define(aThis);
        currentScope.define(jMethod);
        ctx.scope = jMethod;
        pushScope(jMethod);
    }

    @Override
    public void exitLabelMethod(JParser.LabelMethodContext ctx) {
        popScope();
    }

    @Override
    public void enterFormalParameters(JParser.FormalParametersContext ctx) {
        if(ctx.formalParameterList()==null){
            return;
        }
        for (int i =0 ; i< ctx.formalParameterList().t.size(); i++){
            VariableSymbol variableSymbol = new VariableSymbol(ctx.formalParameterList().t.get(i).ID().getText());
            variableSymbol.setType((Type) currentScope.resolve(ctx.formalParameterList().t.get(i).typeType().getText()));
            variableSymbol.setScope(currentScope);
            currentScope.define(variableSymbol);
        }
    }



    public ClassSymbol getEnclosingClass(Scope s) {
        while (s != null) {
            if (s instanceof ClassSymbol) return (ClassSymbol) s;
            s = s.getEnclosingScope();
        }
        return null;
    }

    private void pushScope(Scope s) {
        currentScope = s;
        System.out.println("entering: " + currentScope.getName() + ":" + s);
    }


    private void popScope() {
        System.out.println("leaving: " + currentScope.getName() + ":" + currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    private void defineGlobalPrimitiveType() {
        currentScope.define(new JPrimitiveType("int"));
        currentScope.define(new JPrimitiveType("float"));
        currentScope.define(new JPrimitiveType("string"));
        currentScope.define(new JPrimitiveType("void"));
    }
}