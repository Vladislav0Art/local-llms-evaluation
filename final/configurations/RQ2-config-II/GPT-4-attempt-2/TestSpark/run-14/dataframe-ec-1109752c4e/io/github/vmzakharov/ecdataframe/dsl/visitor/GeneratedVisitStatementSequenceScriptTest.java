package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitStatementSequenceScriptTest {

    @Test
    public void visitStatementSequenceScriptTest() {
        StatementSequenceScript expr = Mockito.mock(StatementSequenceScript.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitStatementSequenceScript(expr);
    }

}