package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAnonymousScriptExpr_AnonymousFunctionCall {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitAnonymousScriptExpr_AnonymousFunctionCall() {
        AnonymousScript script = new AnonymousScript(new ListIterable[]{Value.of(5), Value.of(3)});
        prettyPrintVisitor.visit(script);
        verify(printer).printExpression("func (5+ 3)");
    }

}