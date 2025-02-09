package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAliasExprTest {

    @Test
    public void visitAliasExprTest() {
        AliasExpr expr = Mockito.mock(AliasExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAliasExpr(expr);
    }

}