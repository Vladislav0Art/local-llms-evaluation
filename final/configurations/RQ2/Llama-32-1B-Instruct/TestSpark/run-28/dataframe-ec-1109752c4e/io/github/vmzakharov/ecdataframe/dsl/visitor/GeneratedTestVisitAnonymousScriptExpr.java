package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestVisitAnonymousScriptExpr {

    @Test
    public void testVisitAnonymousScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AnonymousScript expr = mock(AnonymousScript.class);
        VisitorResult result = visitor.visit(expr);

        assertEquals(1, result.getErrors().size());

        verify(expr).visit();
    }

}