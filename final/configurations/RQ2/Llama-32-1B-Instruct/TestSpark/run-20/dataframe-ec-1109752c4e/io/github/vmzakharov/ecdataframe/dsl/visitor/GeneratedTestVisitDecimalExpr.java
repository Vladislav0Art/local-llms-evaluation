package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitDecimalExpr {

    private Printer printer;

    @Test
    public void testVisitDecimalExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        DecimalExpr expr = StringIterate.of("+ 42e-10").exprToString();
        assert visitor.visitDecimalExpr(expr) : "Failed to visit DecimalExpr";
    }

}