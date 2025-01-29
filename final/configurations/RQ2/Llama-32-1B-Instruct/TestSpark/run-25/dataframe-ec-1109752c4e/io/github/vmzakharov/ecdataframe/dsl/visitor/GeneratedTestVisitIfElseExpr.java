package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitIfElseExpr {

    private StringPrinter printer;

    @Before
    public void setup() {
        // Initialize Mockito for mocking dependencies
        MockitoAnnotations.initMocks(this);

        printer = new StringPrinter();
    }

    @Test
    public void testVisitIfElseExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitIfElseExpr(new IfElseExpr(IfElseExpr.IF_NAME, ListIterable.of(new Expression[]{new ConstExpr(Value.CLEAR_VALUE), new ConstExpr(Value.NAME)})));
    }

}