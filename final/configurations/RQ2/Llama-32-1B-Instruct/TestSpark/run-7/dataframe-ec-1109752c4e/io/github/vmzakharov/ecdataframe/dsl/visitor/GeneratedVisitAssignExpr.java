package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitAssignExpr {

    private Printer printer;

    @Test
    public void visitAssignExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AnonymousScript script = new AnonymousScript();
        Express assignExpr = new AssignExpr("x", 10);
        script.addExpression(assignExpr);
        visitor.visitAssignExpr(script);
        assertEquals(16, printer.print(visitedExpressions));
    }

}