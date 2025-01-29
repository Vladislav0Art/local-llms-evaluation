package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAliasExpr_AlternativeAssignment {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitAliasExpr_AlternativeAssignment() {
        AliasExpr expr = new AliasExpr(new String[]{"y", "z"}, Value.of(10));
        prettyPrintVisitor.visit(expr);
        verify(printer).printExpression("alt assign y 10 z");
    }

}