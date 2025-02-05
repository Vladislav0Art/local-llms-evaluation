package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr assignExpr = Mockito.mock(AssingExpr.class);
        Mockito.doCallRealMethod().when(assignExpr).accept(Mockito.any());

        assignExpr.accept(new PrettyPrintVisitor());
        Mockito.verify(assignExpr, Mockito.times(1)).accept(Mockito.any());
    }

}