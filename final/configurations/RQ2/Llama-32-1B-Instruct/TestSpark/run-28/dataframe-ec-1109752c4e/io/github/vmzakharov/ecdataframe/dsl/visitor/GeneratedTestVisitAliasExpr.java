package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestVisitAliasExpr {

    @Test
    public void testVisitAliasExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AliasExpr expr = mock(AliasExpr.class);
        VisitorResult result = visitor.visit(expr);

        assertEquals(0, result.getErrors().size());
        verify(expr).visit();
    }

}