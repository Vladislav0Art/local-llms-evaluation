package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitPropertyPathExprTest {

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr propertyPathExpr = mock(PropertyPathExpr.class);
        propertyPathExpr.visit(new PrettyPrintVisitor(propertyPathExpr, false));
        String expectResult = "(PropertyPathExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(propertyPathExpr));
    }

}