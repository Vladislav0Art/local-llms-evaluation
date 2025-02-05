package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitStatementSequenceScriptTest {

    @Test
    public void visitStatementSequenceScriptTest() {
        StatementSequenceScript statementSequenceScript = Mockito.mock(StatementSequenceScript.class);
        Mockito.doCallRealMethod().when(statementSequenceScript).accept(Mockito.any());

        statementSequenceScript.accept(new PrettyPrintVisitor());
        Mockito.verify(statementSequenceScript, Mockito.times(1)).accept(Mockito.any());
    }

}