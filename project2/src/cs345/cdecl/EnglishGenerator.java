package cs345.cdecl;

public class EnglishGenerator extends CDeclBaseVisitor<String> {
	// YOU MUST FILL THIS IN

    @Override
    public String visitTypename(CDeclParser.TypenameContext ctx) {
        if(ctx.getText().equals("void")){
            return " " + "nothing";
        }
        return " " + ctx.getText();
    }

    @Override
    public String visitDeclaration(CDeclParser.DeclarationContext ctx) {
        return visit(ctx.declarator()) + visit(ctx.typename());
    }

    @Override
    public String visitArray(CDeclParser.ArrayContext ctx) {
        return visit(ctx.declarator()) + " array of";
    }

    @Override
    public String visitVar(CDeclParser.VarContext ctx) {
        return ctx.ID().getText() + " is a";
    }

    @Override
    public String visitPointer(CDeclParser.PointerContext ctx) {
        return visit(ctx.declarator()) + " pointer to";
    }

    @Override
    public String visitFunc(CDeclParser.FuncContext ctx) {
        return visit(ctx.declarator()) + " function returning";
    }

    @Override
    public String visitGrouping(CDeclParser.GroupingContext ctx) {
        return visit(ctx.declarator());
    }
}
