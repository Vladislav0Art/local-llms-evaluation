package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = Mockito.mock(FunctionCallExpr.class);
        Mockito.doCallRealMethod().when(functionCallExpr).accept(Mockito.any());

        functionCallExpr.accept(new PrettyPrintVisitor());
        Mockito.verify(functionCallExpr, Mockito.times(1)).accept(Mockito.any());
    }

}