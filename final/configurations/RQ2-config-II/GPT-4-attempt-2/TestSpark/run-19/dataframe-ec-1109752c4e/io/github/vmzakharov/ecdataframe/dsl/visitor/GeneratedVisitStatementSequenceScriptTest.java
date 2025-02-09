package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitStatementSequenceScriptTest {

    @Test
    public void visitStatementSequenceScriptTest() {
        StatementSequenceScript statementSequenceScript = Mockito.mock(StatementSequenceScript.class);
        new PrettyPrintVisitor().visitStatementSequenceScript(statementSequenceScript);
    }

}