package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionScriptExpr {

    @Test
    public void testVisitFunctionScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionScript functionScript = new FunctionScript(
                new VarExpr("x"),
                "add",
                new VarExpr("y")
        );
        String result = visitor.visit(functionScript);
        assertEquals("\"2.0\"", result);
    }

}