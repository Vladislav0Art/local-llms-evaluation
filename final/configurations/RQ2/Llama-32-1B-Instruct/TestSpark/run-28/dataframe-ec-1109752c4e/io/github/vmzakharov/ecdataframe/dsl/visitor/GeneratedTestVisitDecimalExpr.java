package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestVisitDecimalExpr {

    @Test
    public void testVisitDecimalExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        DecimalExpr expr = mock(DecimalExpr.class);
        VisitorResult result = visitor.visit(expr);

        assertEquals(1, result.getErrors().size());

        verify(expr).visit();
    }

}