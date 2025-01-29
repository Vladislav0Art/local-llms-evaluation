package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitDecimalExpr {

    private StringPrinter printer;

    @Before
    public void setup() {
        // Initialize Mockito for mocking dependencies
        MockitoAnnotations.initMocks(this);

        printer = new StringPrinter();
    }

    @Test
    public void testVisitDecimalExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitDecimalExpr(new DecimalExpr(DecimalExpr.DECIMAL_NAME, new Expression[]{new ConstExpr(Value.CLEAR_VALUE), new ConstExpr(Value.NAME)})));
    }

}