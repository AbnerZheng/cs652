package cs652.j.semantics;

import cs652.j.parser.JBaseListener;
import cs652.j.parser.JParser;
import org.antlr.symtab.*;

public class ComputeTypes extends JBaseListener {
    protected StringBuilder buf = new StringBuilder();
    Scope currentScope;

    public static final Type JINT_TYPE = new JPrimitiveType("int");
    public static final Type JFLOAT_TYPE = new JPrimitiveType("float");
    public static final Type JSTRING_TYPE = new JPrimitiveType("string");
    public static final Type JVOID_TYPE = new JPrimitiveType("void");

    public ComputeTypes(GlobalScope globals) {
        this.currentScope = globals;
    }

    @Override
    public void enterStatement(JParser.StatementContext ctx) {
//        currentScope = ctx.scope;
    }



    @Override
    public void exitLabelOfCall(JParser.LabelOfCallContext ctx) {
        typeInfoGene(ctx.getText(), ctx.expression().type);
        ctx.type = ctx.expression().type;
    }

    @Override
    public void exitLableOfFieldVisit(JParser.LableOfFieldVisitContext ctx) {
        final JClass jClass = (JClass) ctx.expression().type;
        final Symbol symbol = jClass.resolve(ctx.ID().getText());
        if(symbol instanceof FieldSymbol){
            ctx.type = ((FieldSymbol) symbol).getType();
            typeInfoGene(ctx.getText(), ctx.type);
        }else if(symbol instanceof MethodSymbol){
            ctx.type = ((MethodSymbol) symbol).getType();
        }
    }

    @Override
    public void exitLabelParExpression(JParser.LabelParExpressionContext ctx) {
        ctx.type = ctx.parExpression().expression().type;
    }

    @Override
    public void exitLabelThis(JParser.LabelThisContext ctx) {
        final ClassSymbol enclosingClass = getEnclosingClass(currentScope);
        ctx.type = enclosingClass;
        typeInfoGene(ctx.getText(), ctx.type);
    }

    @Override
    public void exitLabelOfNew(JParser.LabelOfNewContext ctx) {
        final JClass jClass = (JClass) currentScope.resolve(ctx.ID().getText());
        ctx.type = jClass;
        typeInfoGene(ctx.getText(), jClass);
    }

    @Override
    public void enterStatementOfMain(JParser.StatementOfMainContext ctx) {
        currentScope = ctx.scope;
    }

    @Override
    public void exitLabelInt(JParser.LabelIntContext ctx) {
        ctx.type = ComputeTypes.JINT_TYPE;
        typeInfoGene(ctx.getText(), ctx.type);
    }

    @Override
    public void enterBlock(JParser.BlockContext ctx) {
        currentScope =  ctx.scope;
    }

    @Override
    public void exitLabelID(JParser.LabelIDContext ctx) {
        final Symbol resolve = currentScope.resolve(ctx.ID().getText());
        if(resolve instanceof JMethod){
            ctx.type = ((JMethod) resolve).getType();
        }else if(resolve instanceof VariableSymbol){
            ctx.type = ((VariableSymbol) resolve).getType();
            typeInfoGene(ctx.ID().getText(), ctx.type);
        }
    }

    @Override
    public void enterLabelFloat(JParser.LabelFloatContext ctx) {
        ctx.type = ComputeTypes.JFLOAT_TYPE;
        typeInfoGene(ctx.getText(), ctx.type);
    }

    @Override
    public void exitLabelOfPrimary(JParser.LabelOfPrimaryContext ctx) {
        ctx.type = ctx.primary().type;
    }

    @Override
    public void enterLabelString(JParser.LabelStringContext ctx) {
        ctx.type = JSTRING_TYPE;
    }

    //    @Override
//    public void enterLabelCallFunc(JParser.LabelCallFuncContext ctx) {
//    }


    private void typeInfoGene(String id, Type type) {
        if (type.getName() == "string") {
            return;
        }
        buf.append(id + " is " + type.getName() + "\n");
    }

    @Override
    public void enterClassDeclaration(JParser.ClassDeclarationContext ctx) {
        currentScope = ctx.scope;
    }

//    @Override
//    public void enterMethodDeclaration(JParser.MethodDeclarationContext ctx) {
//        final String methodText =ctx.ID().getText();
//        final MethodSymbol method = (MethodSymbol) currentScope.resolve(methodText);
//        buf.append(methodText + " is " + method.getType().getName() + "\n");
//        currentScope = ctx.scope;
//    }

//    @Override
//    public void enterParameters(JParser.ParametersContext ctx) {
//        for (int i =0 ; i< ctx.t.size(); i++){
//            VariableSymbol variableSymbol = (VariableSymbol) currentScope.resolve(ctx.id.get(i).getText());
//            final String typename = variableSymbol.getType().getName();
//            buf.append(variableSymbol.getName() + " is " + typename + "\n");
//        }
//    }


    @Override
    public void enterLabelMethod(JParser.LabelMethodContext ctx) {
        currentScope = ctx.scope;
    }

    public String getRefOutput() {
        return buf.toString();
    }

    private void popScope() {
        System.out.println("leaving: " + currentScope.getName() + ":" + currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    private void pushScope(Scope s) {
        s.getNestedScopedSymbols();
        currentScope = s;
        System.out.println("entering: " + currentScope.getName() + ":" + s);
    }

    public ClassSymbol getEnclosingClass(Scope s) {
        while (s != null) {
            if (s instanceof ClassSymbol) return (ClassSymbol) s;
            s = s.getEnclosingScope();
        }
        return null;
    }
}

