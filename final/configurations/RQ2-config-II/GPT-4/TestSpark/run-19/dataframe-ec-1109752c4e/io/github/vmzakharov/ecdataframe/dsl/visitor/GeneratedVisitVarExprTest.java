package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        VarExpr varExpr = Mockito.mock(VarExpr.class);
        Mockito.doCallRealMethod().when(varExpr).accept(Mockito.any());

        varExpr.accept(new PrettyPrintVisitor());
        Mockito.verify(varExpr, Mockito.times(1)).accept(Mockito.any());
    }

}