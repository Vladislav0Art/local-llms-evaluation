package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAliasExpr {

    private StringPrinter printer;

    @Before
    public void setup() {
        // Initialize Mockito for mocking dependencies
        MockitoAnnotations.initMocks(this);

        printer = new StringPrinter();
    }

    @Test
    public void testVisitAliasExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitAliasExpr(new AliasExpr(AssingExpr.ASS_NAME, "y", new Expression[]{new ConstExpr(Value.CLEAR_VALUE)})));
    }

}