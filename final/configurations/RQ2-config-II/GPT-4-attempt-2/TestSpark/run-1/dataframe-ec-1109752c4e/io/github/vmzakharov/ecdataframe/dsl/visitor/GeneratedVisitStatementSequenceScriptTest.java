package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitStatementSequenceScriptTest {

    @Test
    public void visitStatementSequenceScriptTest() {
        Printer printer = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        StatementSequenceScript expr = Mockito.mock(StatementSequenceScript.class);
        visitor.visitStatementSequenceScript(expr);
        Mockito.verify(printer, Mockito.times(1)).stringValueOf(expr);
    }

}