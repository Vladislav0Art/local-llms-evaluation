package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestPropertyPathExpr {

    @Test
    public void testPropertyPathExpr() {
        VarExpr varExpr = new VarExpr("h");
        PropertyPathExpr expr = new PropertyPathExpr(varExpr, "f.g");
        String expectedExpr = (String) expr.getVarExpr().getExpr();
        assertEquals(expectedExpr.substring(0, expectedExpr.lastIndexOf('.')), "h");
    }
}

}