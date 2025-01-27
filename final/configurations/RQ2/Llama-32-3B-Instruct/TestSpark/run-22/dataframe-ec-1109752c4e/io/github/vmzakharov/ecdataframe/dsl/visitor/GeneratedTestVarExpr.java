package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVarExpr {

    @Test
    public void testVarExpr() {
        VarExpr varExpr = new VarExpr("e");
        assertEquals(varExpr.getExpr(), "e");
    }
}

}