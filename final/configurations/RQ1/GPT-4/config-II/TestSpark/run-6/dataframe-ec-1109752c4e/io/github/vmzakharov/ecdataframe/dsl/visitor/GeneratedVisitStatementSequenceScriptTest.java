package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitStatementSequenceScriptTest {

    @Test
    public void visitStatementSequenceScriptTest() {
        StatementSequenceScript statementSequenceScript = mock(StatementSequenceScript.class);
        statementSequenceScript.visit(new PrettyPrintVisitor(statementSequenceScript, false));
        String expectResult = "(StatementSequenceScript)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(statementSequenceScript));
    }

}