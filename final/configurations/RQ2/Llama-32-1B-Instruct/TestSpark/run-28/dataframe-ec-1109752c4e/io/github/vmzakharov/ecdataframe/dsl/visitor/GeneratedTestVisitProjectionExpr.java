package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestVisitProjectionExpr {

    @Test
    public void testVisitProjectionExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ProjectionExpr expr = mock(ProjectionExpr.class);
        VisitorResult result = visitor.visit(expr);

        assertEquals(1, result.getErrors().size());

        verify(expr).visit();
    }

}