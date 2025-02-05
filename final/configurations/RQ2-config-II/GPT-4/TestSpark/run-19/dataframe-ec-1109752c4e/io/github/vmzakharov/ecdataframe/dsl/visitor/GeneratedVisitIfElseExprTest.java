package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr ifElseExpr = Mockito.mock(IfElseExpr.class);
        Mockito.doCallRealMethod().when(ifElseExpr).accept(Mockito.any());

        ifElseExpr.accept(new PrettyPrintVisitor());
        Mockito.verify(ifElseExpr, Mockito.times(1)).accept(Mockito.any());
    }

}