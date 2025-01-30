package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.eclipse.collections.impl.list.mutable.FastList;

public class GeneratedVisitAliasExprTest {

    private static final VarExpr VAR_EXPR = new VarExpr("variable", false);

    @Test
    public void visitAliasExprTest() {
        AliasExpr aliasExpr = new AliasExpr("alias", VAR_EXPR);
        String expected = "alias : variable";
        String actual = PrettyPrintVisitor.exprToString(aliasExpr);
        assertEquals(expected, actual);
    }

}