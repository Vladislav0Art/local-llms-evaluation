package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestVisitConstExpr {

    @Test
    public void testVisitConstExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ConstExpr expr = mock(ConstExpr.class);
        VisitorResult result = visitor.visit(expr);

        assertEquals(0, result.getErrors().size());
        verify(expr).visit();
    }

}