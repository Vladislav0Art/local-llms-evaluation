package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAssignExpr {

    @Test
    public void testVisitAssignExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression assignExpr = new Value("x", "int");
        String result = visitor.visit(assignExpr);
        assertEquals("\"x\"", result);
    }

}