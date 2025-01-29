package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTest {

    private Printer printer;

    @Test
    public void visitAssignExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AnonymousScript script = new AnonymousScript();
        Express assignExpr = new AssignExpr("x", 10);
        script.addExpression(assignExpr);
        visitor.visitAssignExpr(script);
        assertEquals(16, printer.print(visitedExpressions));
    }

    @Test
    public void visitBinaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        BinaryExpr binaryExpr = new BinaryExpr("x", 10, "y");
        visitor.visitBinaryExpr(binaryExpr);
        assertEquals(32, printer.print(visitedExpressions));
    }

    @Test
    public void visitUnaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        UnaryExpr unaryExpr = new UnaryExpr("x", 10);
        visitor.visitUnaryExpr(unaryExpr);
        assertEquals(20, printer.print(visitedExpressions));
    }

    @Test
    public void visitConstExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ConstExpr constExpr = new ConstExpr(5);
        visitor.visitConstExpr(constExpr);
        assertEquals(6, printer.print(visitedExpressions));
    }

    @Test
    public void visitFunctionCallExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionCallExpr functionCallExpr = new FunctionCallExpr("x", 10, "y");
        visitor.visitFunctionCallExpr(functionCallExpr);
        assertEquals(52, printer.print(visitedExpressions));
    }

    @Test
    public void visitPropertyPathExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PropertyPathExpr propertyPathExpr = new PropertyPathExpr("x", "y");
        visitor.visitPropertyPathExpr(propertyPathExpr);
        assertEquals(52, printer.print(visitedExpressions));
    }

    @Test
    public void visitAnonymousScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AnonymousScript anonymousScript = new AnonymousScript();
        Expression expr = new VarExpr("x");
        expr.addExpression(new ConstExpr(5));
        anonymousScript.addExpression(expr);
        visitor.visitAnonymousScriptExpr(anonymousScript);
        assertEquals(20, printer.print(visitedExpressions));
    }

    @Test
    public void visitFunctionScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionScript functionScript = new FunctionScript("x", 10);
        visitor.visitFunctionScriptExpr(functionScript);
        assertEquals(64, printer.print(visitedExpressions));
    }

    @Test
    public void visitStatementSequenceScript() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        StatementSequenceScript statementSequenceScript = new StatementSequenceScript("if (x > 5) {y = 10;}");
        visitor.visitStatementSequenceScript(statementSequenceScript);
        assertEquals(76, printer.print(visitedExpressions));
    }

    @Test
    public void visitVarExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VarExpr varExpr = new VarExpr("x");
        visitor.visitVarExpr(varExpr);
        assertEquals(8, printer.print(visitedExpressions));
    }

    @Test
    public void visitProjectionExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ProjectionExpr projectionExpr = new ProjectionExpr("y", "x");
        visitor.visitProjectionExpr(projectionExpr);
        assertEquals(72, printer.print(visitedExpressions));
    }

    @Test
    public void visitAliasExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AliasExpr aliasExpr = new AliasExpr("z", 10);
        visitor.visitAliasExpr(aliasExpr);
        assertEquals(84, printer.print(visitedExpressions));
    }

    @Test
    public void visitVectorExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VectorExpr vectorExpr = new VectorExpr(new VarExpr("x"), new ConstExpr(5));
        visitor.visitVectorExpr(vectorExpr);
        assertEquals(90, printer.print(visitedExpressions));
    }

    @Test
    public void visitIndexExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IndexExpr indexExpr = new IndexExpr(new VarExpr("x"), 2);
        visitor.visitIndexExpr(indexExpr);
        assertEquals(92, printer.print(visitedExpressions));
    }

    @Test
    public void visitDecimalExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        DecimalExpr decimalExpr = new DecimalExpr(10.5);
        visitor.visitDecimalExpr(decimalExpr);
        assertEquals(102, printer.print(visitedExpressions));
    }

    @Test
    public void visitIfElseExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IfElseExpr ifElseExpr = new IfElseExpr("x > 5", "y = 10");
        visitor.visitIfElseExpr(ifElseExpr);
        assertEquals(124, printer.print(visitedExpressions));
    }

}