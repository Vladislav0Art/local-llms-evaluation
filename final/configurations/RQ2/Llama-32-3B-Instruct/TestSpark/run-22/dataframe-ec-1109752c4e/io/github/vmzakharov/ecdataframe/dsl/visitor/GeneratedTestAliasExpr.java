package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestAliasExpr {

    @Test
    public void testAliasExpr() {
        VarExpr varExpr = new VarExpr("k");
        AliasExpr aliasExpr = new AliasExpr(varExpr, "l");
        String expectedExpr = (String) aliasExpr.getVarExpr().getExpr();
        assertEquals(expectedExpr, "k");
    }

}