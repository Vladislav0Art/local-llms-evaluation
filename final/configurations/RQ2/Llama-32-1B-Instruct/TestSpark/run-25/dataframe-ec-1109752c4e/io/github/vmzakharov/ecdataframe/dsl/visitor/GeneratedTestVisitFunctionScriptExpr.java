package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionScriptExpr {

    private StringPrinter printer;

    @Before
    public void setup() {
        // Initialize Mockito for mocking dependencies
        MockitoAnnotations.initMocks(this);

        printer = new StringPrinter();
    }

    @Test
    public void testVisitFunctionScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitFunctionScriptExpr(new FunctionScript(FunctionScript.FUNCTION_NAME, new Expression[]{new AliasExpr(AssingExpr.ASS_NAME, "a")})));
    }

}