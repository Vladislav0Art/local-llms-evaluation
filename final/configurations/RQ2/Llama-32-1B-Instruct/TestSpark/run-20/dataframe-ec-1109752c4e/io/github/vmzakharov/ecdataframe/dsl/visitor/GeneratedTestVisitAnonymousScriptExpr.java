package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAnonymousScriptExpr {

    private Printer printer;

    @Test
    public void testVisitAnonymousScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AnonymousScript script = StringIterate.of("x y z").exprToString();
        assert visitor.visitAnonymousScriptExpr(script) : "Failed to visit AnonymousScriptExpr";
    }

}