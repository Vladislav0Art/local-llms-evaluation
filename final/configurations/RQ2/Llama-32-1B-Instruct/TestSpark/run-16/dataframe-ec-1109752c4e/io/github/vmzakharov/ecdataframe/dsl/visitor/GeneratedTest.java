package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTest {

    private PrettyPrintVisitor prettyPrintVisitor;
    private Printer printer;

    @Before
    public void setup() {
        prettyPrintVisitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter();
    }

    @Test
    public void testVisitAssignExpr_PrettyPrinting() {
        String expr = "x = 5";
        expressionToTest(expr);
        String printedExpression = prettyPrintVisitor.visit(expr).toString();
        assertEquals("x=5", printedExpression);
    }

    @Test
    public void testVisitBinaryExpr_PrettyPrinting() {
        BinaryExpr expr = new BinaryExpr(new Expression[]{new ConstExpr(10), new AddExpr(2, 3)});
        expressionToTest(expr);
        String printedExpression = prettyPrintVisitor.visit(expr).toString();
        assertEquals("10 + 2 + 3", printedExpression);
    }

    @Test
    public void testVisitUnaryExpr_PrettyPrinting() {
        UnaryExpr expr = new UnaryExpr(new ConstExpr(5));
        expressionToTest(expr);
        String printedExpression = prettyPrintVisitor.visit(expr).toString();
        assertEquals("5", printedExpression);
    }

    @Test
    public void testVisitConstExpr_PrettyPrinting() {
        Value expr = new ConstExpr(10);
        expressionToTest(expr);
        String printedExpression = prettyPrintVisitor.visit(expr).toString();
        assertEquals("10", printedExpression);
    }

    @Test
    public void testVisitFunctionCallExpr_PrettyPrinting() {
        FunctionCallExpr expr = new FunctionCallExpr("x + 5");
        expressionToTest(expr);
        String printedExpression = prettyPrintVisitor.visit(expr).toString();
        assertEquals("x+5", printedExpression);
    }

    private void expressionToTest(Expression e) {
        // Add a method to get the expected output for a given expression
        // For example:
        if (e instanceof ConstExpr) {
            return "10";
        } else if (e instanceof BinaryExpr) {
            return ((BinaryExpr) e).expr1.toString() + " + " + ((BinaryExpr) e).expr2.toString();
        }
    }

}

class CollectingPrinter extends Printer {

    @Override
    public void printValue(String str, Value value) {
        super.printValue(str, value);
    }

}