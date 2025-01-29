package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionScriptExpr {

    private Printer printer;

    @Test
    public void testVisitFunctionScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionScript expr = StringIterate.of("fn x, y".withCollectingPrinter(PrinterFactory.INSTANCE)).exprToString();
        assert visitor.visitFunctionScriptExpr(expr) : "Failed to visit FunctionScriptExpr";
    }

}