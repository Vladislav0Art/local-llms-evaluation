package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAssignExpr {

    private Printer printer;

    public PrettyPrintVisitor(Printer printer) {
        this.printer = printer;
    }

    public String exprToString(Expression e) {
        return printer.print(e);
    }

    @Test
    public void testVisitAssignExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printerFactory);
        Expression e = new AssignExpr(new VarExpr("x"), 5.0, new BinaryExpr(new PlusExpr(new UnaryExpr(new NameExpr("x")), 3), new MulExpr(new ConstExpr(2), new ConstExpr(3))));
        assertEquals("5 + 3 x", visitor.visitAssignExpr(e));
    }

}