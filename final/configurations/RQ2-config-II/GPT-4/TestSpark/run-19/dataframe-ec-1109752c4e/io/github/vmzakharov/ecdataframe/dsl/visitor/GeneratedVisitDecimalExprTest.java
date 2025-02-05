package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitDecimalExprTest {

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr decimalExpr = Mockito.mock(DecimalExpr.class);
        Mockito.doCallRealMethod().when(decimalExpr).accept(Mockito.any());

        decimalExpr.accept(new PrettyPrintVisitor());
        Mockito.verify(decimalExpr, Mockito.times(1)).accept(Mockito.any());
    }

}