package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

public class GeneratedVisitFunctionScriptExprTest {

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript expr = new FunctionScript(null, null, null);
        CollectingPrinter printer = PrinterFactory.newCollectingPrinter();
        new PrettyPrintVisitor(printer).visitFunctionScriptExpr(expr);

        assertEquals("", printer.asString());
    }

}