package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionCallExpr {

    @Test
    public void testVisitFunctionCallExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression functionCallExpr = new FunctionCallExpr(new Value("x", "int"), "add", new VarExpr("y"));
        String result = visitor.visit(functionCallExpr);
        assertEquals("\"1.0\"$", result);
    }

}