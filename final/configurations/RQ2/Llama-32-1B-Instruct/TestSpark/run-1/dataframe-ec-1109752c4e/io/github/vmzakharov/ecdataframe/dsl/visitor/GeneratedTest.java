package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTest {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitAssignExpr_Arithmetic() {
        Expression expr = exprToString(AssingExpr.A + BinaryExpr.B * 2);
        String output = (String) visitor.visit(expr);
        assertEquals("A = A + B * 2", output);
    }

    @Test
    public void testVisitBinaryExpr_Pow() {
        Expression expr = exprToString(BinaryExpr.A ^ BinaryExpr.B);
        String output = (String) visitor.visit(expr);
        assertEquals("(A ^ B)", output);
    }

    @Test
    public void testVisitConstExpr_Identity() {
        Expression expr = exprToString(Value.V0);
        String output = (String) visitor.visit(expr);
        assertEquals("Identity[1]", output);
    }

    @Test
    public void testVisitFunctionCallExpr_FunctionCall() {
        Expression expr = exprToString(FunctionCallExpr.F + "A * B");
        String output = (String) visitor.visit(expr);
        assertEquals("(F + A) * B", output);
    }

    @Test
    public void testVisitPropertyPathExpr_ObjectCreation() {
        Expression expr = exprToString(PropertyPathExpr.O.get());
        String output = (String) visitor.visit(expr);
        assertEquals("Object", output);
    }

    @Test
    public void testVisitAnonymousScriptExpr_EmptyExpression() {
        Expression expr = exprToString(AssingExpr.A == 10, BinaryExpr.B * 2);
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

    @Test
    public void testVisitFunctionScriptExpr_EmptyExpression() {
        Expression expr = exprToString(FunctionCallExpr.F + "A * B");
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

    @Test
    public void testVisitStatementSequenceScript_EmptyExpression() {
        Expression expr = exprToString(AssingExpr.A == 10, BinaryExpr.B * 2);
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

    @Test
    public void testVisitVarExpr_EmptyExpression() {
        Expression expr = exprToString(VarExpr.V);
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

    @Test
    public void testVisitProjectionExpr_EmptyExpression() {
        Expression expr = exprToString(ProjectionExpr.O.get());
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

    @Test
    public void testVisitAliasExpr_EmptyExpression() {
        Expression expr = exprToString(AssingExpr.A == 10, BinaryExpr.B * 2);
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

    @Test
    public void testVisitVectorExpr_EmptyExpression() {
        Expression expr = exprToString(VectorExpr.V.get());
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

    @Test
    public void testVisitIndexExpr_EmptyExpression() {
        Expression expr = exprToString(IndexExpr.I.get());
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

    @Test
    public void testVisitDecimalExpr_EmptyExpression() {
        Expression expr = exprToString(DecimalExpr.D.get());
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

    @Test
    public void testVisitIfElseExpr_EmptyExpression() {
        Expression expr = exprToString(IfElseExpr.I.get());
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

}