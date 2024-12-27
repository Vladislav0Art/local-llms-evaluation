package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitAliasExprTest {

    @Test
    public void visitAliasExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AliasExpr expr = new AliasExpr();
        visitor.visitAliasExpr(expr);
        assertEquals(AliasExpr.class, expr.getClass());
    }

}