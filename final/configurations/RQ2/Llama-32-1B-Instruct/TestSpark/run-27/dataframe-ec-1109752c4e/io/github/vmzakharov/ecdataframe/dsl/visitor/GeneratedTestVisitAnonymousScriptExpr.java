package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAnonymousScriptExpr {

    @Test
    public void testVisitAnonymousScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AnonymousScript anonymousScript = new AnonymousScript(
                new VarExpr("x"),
                "print(\"hello\")";
		);
        String result = visitor.visit(anonymousScript);
        assertEquals("\"hello\"", result);
    }

}