package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionScriptExpr_FunctionDefinition {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitFunctionScriptExpr_FunctionDefinition() {
        FunctionScript script = new FunctionScript(new String[]{"x", "y"}, new ListIterable[]{Value.of(10), Value.of(20)});
        prettyPrintVisitor.visit(script);
        verify(printer).printExpression("func (x y) 10+ 20");
    }

}