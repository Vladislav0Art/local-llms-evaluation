package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void visitProjectionExprTest() {
        ProjectionExpr projectionExpr = mock(ProjectionExpr.class);
        projectionExpr.visit(new PrettyPrintVisitor(projectionExpr, false));
        String expectResult = "(ProjectionExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(projectionExpr));
    }

}