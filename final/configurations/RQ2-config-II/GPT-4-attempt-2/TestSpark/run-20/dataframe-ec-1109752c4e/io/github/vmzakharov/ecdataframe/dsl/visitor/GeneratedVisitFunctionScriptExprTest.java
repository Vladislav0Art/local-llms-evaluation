package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionScriptExprTest {

    @Test
    public void visitFunctionScriptExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        FunctionScript expression = Mockito.mock(FunctionScript.class);

        new PrettyPrintVisitor(printer).visitFunctionScriptExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

}