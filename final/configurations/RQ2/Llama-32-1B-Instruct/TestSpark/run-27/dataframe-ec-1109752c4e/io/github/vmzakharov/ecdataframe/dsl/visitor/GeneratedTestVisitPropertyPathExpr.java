package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitPropertyPathExpr {

    @Test
    public void testVisitPropertyPathExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression propertyPathExpr = new PropertyPathExpr(new VarExpr("x"), "y");
        String result = visitor.visit(propertyPathExpr);
        assertEquals("\"y\"", result);
    }

}