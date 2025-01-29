package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionCallExpr_PrettyPrinting {

    private PrettyPrintVisitor prettyPrintVisitor;
    private Printer printer;

    @Before
    public void setup() {
        prettyPrintVisitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter();
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