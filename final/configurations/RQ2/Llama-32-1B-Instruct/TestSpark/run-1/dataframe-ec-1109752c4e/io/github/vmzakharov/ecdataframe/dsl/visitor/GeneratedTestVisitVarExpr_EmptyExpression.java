package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitVarExpr_EmptyExpression {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitVarExpr_EmptyExpression() {
        Expression expr = exprToString(VarExpr.V);
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

}