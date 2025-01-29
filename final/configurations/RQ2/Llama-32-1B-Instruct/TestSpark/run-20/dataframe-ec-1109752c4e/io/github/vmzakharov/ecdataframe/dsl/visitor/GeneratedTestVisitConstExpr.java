package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitConstExpr {

    private Printer printer;

    @Test
    public void testVisitConstExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Value value = new Value(42);
        assert visitor.visitConstExpr(value) : "Failed to visit ConstExpr";
    }

}