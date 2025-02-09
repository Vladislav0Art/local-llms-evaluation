package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitStatementSequenceScriptTest {

    @Test
    public void visitStatementSequenceScriptTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(PrinterFactory.getDefaultPrinter());
        StatementSequenceScript statementSequenceScript = new StatementSequenceScript();
        statementSequenceScript.accept(visitor);
    }

}