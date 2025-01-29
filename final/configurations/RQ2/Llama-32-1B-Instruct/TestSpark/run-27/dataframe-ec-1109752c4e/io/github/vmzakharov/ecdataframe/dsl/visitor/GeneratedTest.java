package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTest {

    @Test
    public void testVisitAssignExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression assignExpr = new Value("x", "int");
        String result = visitor.visit(assignExpr);
        assertEquals("\"x\"", result);
    }

    @Test
    public void testVisitBinaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression binaryExpr = new BinaryExpr(new VarExpr("x"), "add", new VarExpr("y"));
        String result = visitor.visit(binaryExpr);
        assertEquals("\"1.0\"", result);
    }

    @Test
    public void testVisitUnaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression unaryExpr = new UnaryExpr(new VarExpr("x"), "negate");
        String result = visitor.visit(unaryExpr);
        assertEquals("\"-1.0\"$", result);
    }

    @Test
    public void testVisitConstExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression constExpr = new ConstExpr(new VarExpr("x"), "10");
        String result = visitor.visit(constExpr);
        assertEquals("\"10\"", result);
    }

    @Test
    public void testVisitFunctionCallExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression functionCallExpr = new FunctionCallExpr(new Value("x", "int"), "add", new VarExpr("y"));
        String result = visitor.visit(functionCallExpr);
        assertEquals("\"1.0\"$", result);
    }

    @Test
    public void testVisitPropertyPathExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression propertyPathExpr = new PropertyPathExpr(new VarExpr("x"), "y");
        String result = visitor.visit(propertyPathExpr);
        assertEquals("\"y\"", result);
    }

    @Test
    public void testVisitAnonymousScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AnonymousScript anonymousScript = new AnonymousScript(
                new VarExpr("x"),
                "print(\"hello\")";
		);
        String result = visitor.visit(anonymousScript);
        assertEquals("\"hello\"", result);
    }

    @Test
    public void testVisitFunctionScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionScript functionScript = new FunctionScript(
                new VarExpr("x"),
                "add",
                new VarExpr("y")
        );
        String result = visitor.visit(functionScript);
        assertEquals("\"2.0\"", result);
    }

    @Test
    public void testVisitStatementSequenceScript() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        StatementSequenceScript statementSequenceScript = new StatementSequenceScript(
                new VarExpr("x"),
                "print(\"hello\")",
                new VarExpr("y")
        );
        String result = visitor.visit(statementSequenceScript);
        assertEquals("\"hello\ny\"", result);
    }

    @Test
    public void testVisitVarExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression varExpr = new VarExpr(new VarExpr("x"));
        String result = visitor.visit(varExpr);
        assertEquals("\"x\"", result);
    }

    @Test
    public void testVisitProjectionExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ProjectionExpr projectionExpr = new ProjectionExpr(
                new VarExpr("x"),
                new VarExpr("y")
        );
        String result = visitor.visit(projectionExpr);
        assertEquals("\"x,y\"", result);
    }

    @Test
    public void testVisitAliasExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression aliasExpr = new AliasExpr(new VarExpr("x"));
        String result = visitor.visit(aliasExpr);
        assertEquals("\"x\"", result);
    }

    @Test
    public void testVisitVectorExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VectorExpr vectorExpr = new VectorExpr(
                new VarExpr("x"),
                new VarExpr("y")
        );
        String result = visitor.visit(vectorExpr);
        assertEquals("\"[1.0, 2.0]", result);
    }

    @Test
    public void testVisitIndexExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression indexExpr = new IndexExpr(
                new VarExpr("x"),
                "subtract",
                new VarExpr("y")
        );
        String result = visitor.visit(indexExpr);
        assertEquals("\"1.0\"$", result);
    }

    @Test
    public void testVisitDecimalExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression decimalExpr = new DecimalExpr(
                "subtract",
                2,
                new VarExpr("x")
        );
        String result = visitor.visit(decimalExpr);
        assertEquals("\"0.0\"$", result);
    }

    @Test
    public void testVisitIfElseExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IfElseExpr ifElseExpr = new IfElseExpr(
                "greater than",
                5,
                new VarExpr("x")
        );
        String result = visitor.visit(ifElseExpr);
        assertEquals("\"print(\"hello\")\"$", result);
    }

}