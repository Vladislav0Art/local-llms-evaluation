package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestVisitVectorExpr {

    @Test
    public void testVisitVectorExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VectorExpr expr = mock(VectorExpr.class);
        VisitorResult result = visitor.visit(expr);

        assertEquals(1, result.getErrors().size());

        verify(expr).visit();
    }

}