package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitStatementSequenceScript {

    @Test
    public void testVisitStatementSequenceScript() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        StatementSequenceScript statementSequenceScript = new StatementSequenceScript(
                new VarExpr("x"),
                "print(\"hello\")",
                new VarExpr("y")
        );
        String result = visitor.visit(statementSequenceScript);
        assertEquals("\"hello\ny\"", result);
    }

}