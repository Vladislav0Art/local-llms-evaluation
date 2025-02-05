package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        Value constExpr = Mockito.mock(Value.class);
        Mockito.doCallRealMethod().when(constExpr).accept(Mockito.any());

        constExpr.accept(new PrettyPrintVisitor());
        Mockito.verify(constExpr, Mockito.times(1)).accept(Mockito.any());
    }

}