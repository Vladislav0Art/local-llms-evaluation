package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitIndexExprTest {

    @Test
    public void visitIndexExprTest() {
        IndexExpr indexExpr = Mockito.mock(IndexExpr.class);
        Mockito.doCallRealMethod().when(indexExpr).accept(Mockito.any());

        indexExpr.accept(new PrettyPrintVisitor());
        Mockito.verify(indexExpr, Mockito.times(1)).accept(Mockito.any());
    }

}