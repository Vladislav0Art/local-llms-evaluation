package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitIfElseExpr {

    @Test
    public void testVisitIfElseExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IfElseExpr ifElseExpr = new IfElseExpr(
                "greater than",
                5,
                new VarExpr("x")
        );
        String result = visitor.visit(ifElseExpr);
        assertEquals("\"print(\"hello\")\"$", result);
    }

}