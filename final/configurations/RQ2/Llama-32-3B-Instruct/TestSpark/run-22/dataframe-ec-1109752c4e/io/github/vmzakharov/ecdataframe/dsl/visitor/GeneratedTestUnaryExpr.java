package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestUnaryExpr {

    @Test
    public void testUnaryExpr() {
        VarExpr varExpr = new VarExpr("i");
        AliasExpr aliasExpr = new AliasExpr(varExpr, "j");
        UnaryExpr expr = new UnaryExpr(aliasExpr, '+');
        String expectedExpr = (String) expr.getAliasExpr().getVarExpr().getExpr();
        assertEquals(expectedExpr, "i");
    }
}

}