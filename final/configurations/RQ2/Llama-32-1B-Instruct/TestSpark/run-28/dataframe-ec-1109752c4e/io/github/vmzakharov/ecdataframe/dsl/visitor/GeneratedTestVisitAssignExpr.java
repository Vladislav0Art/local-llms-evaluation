package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestVisitAssignExpr {

    @Test
    public void testVisitAssignExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AssignmentExpr expr = mock(AssingExpr.class);
        VisitorResult result = visitor.visit(expr);

        assertEquals(0, result.getErrors().size());
        verify(expr).visit();
    }

}