package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr {

    private Printer printer;

    public PrettyPrintVisitor(Printer printer) {
        this.printer = printer;
    }

    public String exprToString(Expression e) {
        return printer.print(e);
    }

    @Test
    public void testVisitBinaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printerFactory);
        Expression e = new BinaryExpr(new MulExpr(new PlusExpr(new UnaryExpr(new NameExpr("x")), 2), new ConstExpr(3)), new ConstExpr(4));
        assertEquals("x + (y * 2) 4", visitor.visitBinaryExpr(e));
    }

}