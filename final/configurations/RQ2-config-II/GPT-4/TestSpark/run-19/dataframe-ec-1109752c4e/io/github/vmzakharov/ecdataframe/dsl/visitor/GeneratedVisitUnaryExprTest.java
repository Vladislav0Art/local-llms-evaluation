package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = Mockito.mock(UnaryExpr.class);
        Mockito.doCallRealMethod().when(unaryExpr).accept(Mockito.any());

        unaryExpr.accept(new PrettyPrintVisitor());
        Mockito.verify(unaryExpr, Mockito.times(1)).accept(Mockito.any());
    }

}