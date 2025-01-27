package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTest {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitAssignExpr_ReturnsEmptyString() {
        AssignmentExpr expr = new AssigningExpr(new VarExpr("x"), new Value(5));
        String result = PrettyPrintVisitor.exprToString(visitor.visitAssignExpr(expr));
        assertEquals("", result);
    }

    @Test
    public void visitBinaryExpr_ReturnsCorrectStringFormat() {
        BinaryExpr expr = new BinaryExpr(new VarExpr("a"), "+", new Value(5));
        String result = PrettyPrintVisitor.exprToString(visitor.visitBinaryExpr(expr));
        assertEquals("a + 5", result);
    }

    @Test
    public void visitUnaryExpr_ReturnsCorrectStringFormat() {
        UnaryExpr expr = new UnaryExpr(new VarExpr("b"), "-");
        String result = PrettyPrintVisitor.exprToString(visitor.visitUnaryExpr(expr));
        assertEquals("-b", result);
    }

    @Test
    public void visitConstExpr_ReturnsValueAsString() {
        Value expr = new Value(5);
        String result = PrettyPrintVisitor.exprToString(visitor.visitConstExpr(expr));
        assertEquals("5", result);
    }

    @Test
    public void visitFunctionCallExpr_ReturnsCorrectStringFormat() {
        FunctionCallExpr expr = new FunctionCallExpr(new VarExpr("func"), new Value(10), new ArrayExpr(new Value(1), new Value(2)));
        String result = PrettyPrintVisitor.exprToString(visitor.visitFunctionCallExpr(expr));
        assertEquals("func([1, 2])", result);
    }

    @Test
    public void visitPropertyPathExpr_ReturnsCorrectStringFormat() {
        PropertyPathExpr expr = new PropertyPathExpr(new VarExpr("x"), "y");
        String result = PrettyPrintVisitor.exprToString(visitor.visitPropertyPathExpr(expr));
        assertEquals("x.y", result);
    }

    @Test
    public void visitAnonymousScriptExpr_ReturnsCorrectStringFormat() {
        AnonymousScript expr = new AnonymousScript("{ print(1) }");
        String result = PrettyPrintVisitor.exprToString(visitor.visitAnonymousScriptExpr(expr));
        assertEquals("print(1)", result);
    }

    @Test
    public void visitFunctionScriptExpr_ReturnsCorrectStringFormat() {
        FunctionScript expr = new FunctionScript(new VarExpr("func"), "{ return 10 }");
        String result = PrettyPrintVisitor.exprToString(visitor.visitFunctionScriptExpr(expr));
        assertEquals("func() { return 10 }", result);
    }

    @Test
    public void visitStatementSequenceScript_ReturnsCorrectStringFormat() {
        StatementSequenceScript expr = new StatementSequenceScript("{ print(1) ; print(2) }");
        String result = PrettyPrintVisitor.exprToString(visitor.visitStatementSequenceScript(expr));
        assertEquals("print(1); print(2)", result);
    }

    @Test
    public void visitVarExpr_ReturnsVarNameAsString() {
        VarExpr expr = new VarExpr("x");
        String result = PrettyPrintVisitor.exprToString(visitor.visitVarExpr(expr));
        assertEquals("x", result);
    }

    @Test
    public void visitProjectionExpr_ReturnsCorrectStringFormat() {
        ProjectionExpr expr = new ProjectionExpr(new VarExpr("x"), "y");
        String result = PrettyPrintVisitor.exprToString(visitor.visitProjectionExpr(expr));
        assertEquals("[x.y]", result);
    }

    @Test
    public void visitAliasExpr_ReturnsCorrectStringFormat() {
        AliasExpr expr = new AliasExpr(new VarExpr("x"), "y");
        String result = PrettyPrintVisitor.exprToString(visitor.visitAliasExpr(expr));
        assertEquals("y(x)", result);
    }

    @Test
    public void visitVectorExpr_ReturnsCorrectStringFormat() {
        VectorExpr expr = new VectorExpr(new Value(1), new Value(2));
        String result = PrettyPrintVisitor.exprToString(visitor.visitVectorExpr(expr));
        assertEquals("[1, 2]", result);
    }

    @Test
    public void visitIndexExpr_ReturnsCorrectStringFormat() {
        IndexExpr expr = new IndexExpr(new VarExpr("x"), new Value(5));
        String result = PrettyPrintVisitor.exprToString(visitor.visitIndexExpr(expr));
        assertEquals("x[5]", result);
    }

    @Test
    public void visitDecimalExpr_ReturnsCorrectStringFormat() {
        DecimalExpr expr = new DecimalExpr(new Value(5.5));
        String result = PrettyPrintVisitor.exprToString(visitor.visitDecimalExpr(expr));
        assertEquals("5.5", result);
    }

    @Test
    public void visitIfElseExpr_ReturnsCorrectStringFormat() {
        IfElseExpr expr = new IfElseExpr(new VarExpr("x"), new Value(10), new Value(20));
        String result = PrettyPrintVisitor.exprToString(visitor.visitIfElseExpr(expr));
        assertEquals("if x then 10 else 20", result);
    }

}