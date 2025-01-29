package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitAnonymousScriptExpr {

    private Printer printer;

    @Test
    public void visitAnonymousScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AnonymousScript anonymousScript = new AnonymousScript();
        Expression expr = new VarExpr("x");
        expr.addExpression(new ConstExpr(5));
        anonymousScript.addExpression(expr);
        visitor.visitAnonymousScriptExpr(anonymousScript);
        assertEquals(20, printer.print(visitedExpressions));
    }

}