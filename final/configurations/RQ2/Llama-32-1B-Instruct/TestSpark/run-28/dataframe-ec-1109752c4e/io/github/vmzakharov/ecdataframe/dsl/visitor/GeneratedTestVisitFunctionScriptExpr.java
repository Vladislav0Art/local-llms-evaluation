package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestVisitFunctionScriptExpr {

    @Test
    public void testVisitFunctionScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionScript expr = mock(FunctionScript.class);
        VisitorResult result = visitor.visit(expr);

        assertEquals(0, result.getErrors().size());
        verify(expr).visit();
    }

}