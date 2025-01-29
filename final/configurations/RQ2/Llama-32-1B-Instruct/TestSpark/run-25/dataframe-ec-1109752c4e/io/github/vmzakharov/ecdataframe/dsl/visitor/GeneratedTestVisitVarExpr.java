package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitVarExpr {

    private StringPrinter printer;

    @Before
    public void setup() {
        // Initialize Mockito for mocking dependencies
        MockitoAnnotations.initMocks(this);

        printer = new StringPrinter();
    }

    @Test
    public void testVisitVarExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitVarExpr(new VarExpr("x", new Expression[]{new ConstExpr(Value.CLEAR_VALUE)})));
    }

}