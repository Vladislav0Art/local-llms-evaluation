package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitStatementSequenceScript_SimpleStatement {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitStatementSequenceScript_SimpleStatement() {
        StatementSequenceScript script = new StatementSequenceScript(new ListIterable[]{Value.of(5), Value.of(3)});
        prettyPrintVisitor.visit(script);
        verify(printer).printExpression("stmt (5+ 3)");
    }

}