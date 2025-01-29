package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitUnaryExpr {

    private Printer printer;

    public PrettyPrintVisitor(Printer printer) {
        this.printer = printer;
    }

    public String exprToString(Expression e) {
        return printer.print(e);
    }

    @Test
    public void testVisitUnaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printerFactory);
        Expression e = new UnaryExpr(new NameExpr("x"), new ConstExpr(3));
        assertEquals("(y + x) 3", visitor.visitUnaryExpr(e));
    }
}

}