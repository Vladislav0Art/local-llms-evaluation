package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestVisitIndexExpr {

    @Test
    public void testVisitIndexExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IndexExpr expr = mock(IndexExpr.class);
        VisitorResult result = visitor.visit(expr);

        assertEquals(0, result.getErrors().size());
        verify(expr).visit();
    }

}