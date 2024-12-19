package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitStatementSequenceScript {

    @Test
    public void visitStatementSequenceScript() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        StatementSequenceScript script = mock(StatementSequenceScript.class);
        when(script.toString()).thenReturn(" x + y ");
        String actual = visitor.visit(script);
        assert actual.equals("x + y \n");
    }

}