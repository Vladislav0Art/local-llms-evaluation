package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitVectorExpr {

    private StringPrinter printer;

    @Before
    public void setup() {
        // Initialize Mockito for mocking dependencies
        MockitoAnnotations.initMocks(this);

        printer = new StringPrinter();
    }

    @Test
    public void testVisitVectorExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitVectorExpr(new VectorExpr(VectorExpr.VECTORIZATION_NAME, ListIterable.of(new Expression[]{new ConstExpr(Value.CLEAR_VALUE)})));
    }

}