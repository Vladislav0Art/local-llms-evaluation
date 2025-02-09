package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitStatementSequenceScriptTest {

    @Test
    public void visitStatementSequenceScriptTest() {
        StatementSequenceScript statementSequenceScript = new StatementSequenceScript(new Statement[0]);
        assertEquals("", PrettyPrintVisitor.exprToString(statementSequenceScript));
    }

}