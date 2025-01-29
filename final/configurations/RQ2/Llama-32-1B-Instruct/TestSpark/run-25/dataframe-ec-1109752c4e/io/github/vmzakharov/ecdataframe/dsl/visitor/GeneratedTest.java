package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTest {

    @Test
    public void testVisitAssignExpr() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitAssignExpr(new AnonymousScriptExpr(AssingExpr.ASS_NAME, "x", "y")));
    }

    @Test
    public void testVisitBinaryExpr() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitBinaryExpr(new BinaryExpr(BinaryExpr.BINARY_NAME, new Expression[]{new VarExpr("a"), new UnaryExpr(UnaryExpr.UNIT_NAME, new Value(1))})));
    }

    @Test
    public void testVisitUnaryExpr() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitUnaryExpr(new UnaryExpr(UnaryExpr.UNARY_NAME, new Expression[]{new VarExpr("x"), new ConstExpr(Value.CLEAR_VALUE)})));
    }

    @Test
    public void testVisitConstExpr() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitConstExpr(new ConstExpr(Value.NAME)));
    }

    @Test
    public void testVisitFunctionCallExpr() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitFunctionCallExpr(new FunctionCallExpr(FunctionCallExpr.FUNCTION_NAME, new Expression[]{new AliasExpr(AssingExpr.ASS_NAME, "a")})));
    }

    @Test
    public void testVisitPropertyPathExpr() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitPropertyPathExpr(new PropertyPathExpr(PropertyPathExpr.PROPERTY_NAME, new Expression[]{new VarExpr("x"), new ConstExpr(Value.CLEAR_VALUE)})));
    }

    @Test
    public void testVisitAnonymousScriptExpr() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitAnonymousScriptExpr(new AnonymousScriptExpr(AssingExpr.ASS_NAME, "x", "y")));
    }

    @Test
    public void testStatementSequenceSpecified() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        StatementSequence sequence = new StatementSequence(new Expression[]{new ConstExpr(Value.CLEAR_VALUE)});
        Assert.assertTrue(visitor.visitStatementSequence(sequence));
    }

    @Test
    public void testProjectionSpecified() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Projection projection = new Projection("x", new Expression[]{new ConstExpr(Value.CLEAR_VALUE)});
        Assert.assertTrue(visitor.visitProjection(projection));
    }

    @Test
    public void testVectorSpecified() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Vector vector = new Vector(new Expression[]{new ConstExpr(Value.CLEAR_VALUE)});
        Assert.assertTrue(visitor.visitVector(vector));
    }

    @Test
    public void testIfElseSpecified() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        IfElse ifElse = new IfElse("if", ListIterable.of(new Expression[]{new ConstExpr(Value.CLEAR_VALUE), new ConstExpr(Value.NAME)});
        Assert.assertTrue(visitor.visitIfElse(ifElse));
    }

}