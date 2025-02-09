package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionScriptExprTest {

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript functionScript = new FunctionScript("functionName", new String[0], new Statement[0]);
        assertEquals("functionName() {\n}", PrettyPrintVisitor.exprToString(functionScript));
    }

}