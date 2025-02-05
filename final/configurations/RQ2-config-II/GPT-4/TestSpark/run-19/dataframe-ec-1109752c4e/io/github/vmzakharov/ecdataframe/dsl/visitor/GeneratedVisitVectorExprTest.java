package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitVectorExprTest {

    @Test
    public void visitVectorExprTest() {
        VectorExpr vectorExpr = Mockito.mock(VectorExpr.class);
        Mockito.doCallRealMethod().when(vectorExpr).accept(Mockito.any());

        vectorExpr.accept(new PrettyPrintVisitor());
        Mockito.verify(vectorExpr, Mockito.times(1)).accept(Mockito.any());
    }

}