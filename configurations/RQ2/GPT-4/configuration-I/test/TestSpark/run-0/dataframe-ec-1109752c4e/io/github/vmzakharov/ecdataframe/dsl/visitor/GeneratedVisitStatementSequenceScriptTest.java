package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitStatementSequenceScriptTest {

    @Test
    public void visitStatementSequenceScriptTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        StatementSequenceScript expr = new StatementSequenceScript();
        visitor.visitStatementSequenceScript(expr);
        assertEquals(StatementSequenceScript.class, expr.getClass());
    }

}