package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitAliasExprTest {

    @Test
    public void visitAliasExprTest() {
        AliasExpr aliasExpr = Mockito.mock(AliasExpr.class);
        Mockito.doCallRealMethod().when(aliasExpr).accept(Mockito.any());

        aliasExpr.accept(new PrettyPrintVisitor());
        Mockito.verify(aliasExpr, Mockito.times(1)).accept(Mockito.any());
    }

}