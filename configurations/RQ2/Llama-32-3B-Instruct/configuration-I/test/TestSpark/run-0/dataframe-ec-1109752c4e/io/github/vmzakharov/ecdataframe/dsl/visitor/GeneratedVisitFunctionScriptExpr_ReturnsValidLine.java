package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVisitFunctionScriptExpr_ReturnsValidLine {

    @Mock
    private Printer printer;

    @Test
    public void visitFunctionScriptExpr_ReturnsValidLine() {
        when(printer.print(anyString())).thenReturn("def func(x): pass");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        String result = visitor.visitFunctionScriptExpr(new FunctionScriptExpression("func", "x"));
        assertEquals("def func(x): pass", result);
    }

}