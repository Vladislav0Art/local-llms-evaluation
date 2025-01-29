package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitSub {

    private PrinterFactory printerFactory;
    private String[] aliases;
    private String[][] anonymousScripts;

    @Before
    public void setUp() throws Exception {
        // Initialize the printer factory
        this.printerFactory = new PrinterFactory();
        // Create an instance of PrettyPrintVisitor with a custom printer
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(this.printerFactory);
    }

    @Test
    public void testVisitSub() {
        Expression expr = StringIterate.with(1, 2).map((value) -> new Value(value)).expr();
        PrettyPrintVisitor.Printer printer = this.printerFactory.createPrinter();
        PrettyPrintVisitor.PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        prettyPrintVisitor.visitSub(expr);
        assertEquals("add(1, -2)", printer.toString());
    }

}