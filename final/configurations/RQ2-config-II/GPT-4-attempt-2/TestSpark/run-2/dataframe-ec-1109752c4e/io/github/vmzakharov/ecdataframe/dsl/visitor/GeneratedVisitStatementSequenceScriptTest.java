package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;

public class GeneratedVisitStatementSequenceScriptTest {

    @Test
    public void visitStatementSequenceScriptTest() {
        StatementSequenceScript expr = Mockito.mock(StatementSequenceScript.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitStatementSequenceScript(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

}