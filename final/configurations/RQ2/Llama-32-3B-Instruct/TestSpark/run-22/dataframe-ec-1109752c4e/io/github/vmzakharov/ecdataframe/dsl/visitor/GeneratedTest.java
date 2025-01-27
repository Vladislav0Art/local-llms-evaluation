package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTest {

    @Test
    public void testVarExpr() {
        VarExpr varExpr = new VarExpr("e");
        assertEquals(varExpr.getExpr(), "e");
    }
}

@Test
public void testPropertyPathExpr() {
    VarExpr varExpr = new VarExpr("h");
    PropertyPathExpr expr = new PropertyPathExpr(varExpr, "f.g");
    String expectedExpr = (String) expr.getVarExpr().getExpr();
    assertEquals(expectedExpr.substring(0, expectedExpr.lastIndexOf('.')), "h");
}
	}

@Test
public void testUnaryExpr() {
    VarExpr varExpr = new VarExpr("i");
    AliasExpr aliasExpr = new AliasExpr(varExpr, "j");
    UnaryExpr expr = new UnaryExpr(aliasExpr, '+');
    String expectedExpr = (String) expr.getAliasExpr().getVarExpr().getExpr();
    assertEquals(expectedExpr, "i");
}
	}

@Test
public void testAliasExpr() {
    VarExpr varExpr = new VarExpr("k");
    AliasExpr aliasExpr = new AliasExpr(varExpr, "l");
    String expectedExpr = (String) aliasExpr.getVarExpr().getExpr();
    assertEquals(expectedExpr, "k");
}

}