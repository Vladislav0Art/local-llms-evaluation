package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitStatementSequenceScript {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitStatementSequenceScript() {
        Expression expr = new StatementSequenceScript(new VarExpr("x"));
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}