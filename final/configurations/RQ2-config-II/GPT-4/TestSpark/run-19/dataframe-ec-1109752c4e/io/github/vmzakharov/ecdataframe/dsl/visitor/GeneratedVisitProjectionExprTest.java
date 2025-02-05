package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void visitProjectionExprTest() {
        ProjectionExpr projExpr = Mockito.mock(ProjectionExpr.class);
        Mockito.doCallRealMethod().when(projExpr).accept(Mockito.any());

        projExpr.accept(new PrettyPrintVisitor());
        Mockito.verify(projExpr, Mockito.times(1)).accept(Mockito.any());
    }

}