package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitStatementSequenceScript {

    private Printer printer;

    @Test
    public void testVisitStatementSequenceScript() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        StatementSequenceScript script = StringIterate.of("x, y z").exprToString();
        assert visitor.visitStatementSequenceScript(script) : "Failed to visit StatementSequenceScript";
    }

}