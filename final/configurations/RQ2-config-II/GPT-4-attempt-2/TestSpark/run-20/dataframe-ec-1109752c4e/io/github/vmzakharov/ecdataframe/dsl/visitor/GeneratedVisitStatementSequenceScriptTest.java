package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitStatementSequenceScriptTest {

    @Test
    public void visitStatementSequenceScriptTest() {
        Printer printer = Mockito.mock(Printer.class);
        StatementSequenceScript expression = Mockito.mock(StatementSequenceScript.class);

        new PrettyPrintVisitor(printer).visitStatementSequenceScript(expression);

        Mockito.verify(printer).print(expression.toString());
    }

}