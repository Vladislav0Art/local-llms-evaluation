package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestVisitIfElseExpr {

    @Test
    public void testVisitIfElseExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IfElseExpr expr = mock(IfElseExpr.class);
        VisitorResult result = visitor.visit(expr);

        assertEquals(1, result.getErrors().size());

        verify(expr).visitLeftChild();
        verify(expr).visitRightChild();
    }

}