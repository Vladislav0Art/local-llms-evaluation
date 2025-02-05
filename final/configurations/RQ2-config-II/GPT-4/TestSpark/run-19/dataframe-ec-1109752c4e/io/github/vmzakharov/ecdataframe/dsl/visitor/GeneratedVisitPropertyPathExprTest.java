package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitPropertyPathExprTest {

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr propertyPathExpr = Mockito.mock(PropertyPathExpr.class);
        Mockito.doCallRealMethod().when(propertyPathExpr).accept(Mockito.any());

        propertyPathExpr.accept(new PrettyPrintVisitor());
        Mockito.verify(propertyPathExpr, Mockito.times(1)).accept(Mockito.any());
    }

}