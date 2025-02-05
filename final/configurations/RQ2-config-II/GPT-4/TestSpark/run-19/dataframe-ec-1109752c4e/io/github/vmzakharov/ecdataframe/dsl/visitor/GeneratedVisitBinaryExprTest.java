package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = Mockito.mock(BinaryExpr.class);
        Mockito.doCallRealMethod().when(binaryExpr).accept(Mockito.any());

        binaryExpr.accept(new PrettyPrintVisitor());
        Mockito.verify(binaryExpr, Mockito.times(1)).accept(Mockito.any());
    }

}