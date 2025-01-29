package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestVisitStatementSequenceScript {

    @Test
    public void testVisitStatementSequenceScript() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        StatementSequenceScript expr = mock(StatementSequenceScript.class);
        VisitorResult result = visitor.visit(expr);

        assertEquals(1, result.getErrors().size());

        verify(expr).visit();
    }

}