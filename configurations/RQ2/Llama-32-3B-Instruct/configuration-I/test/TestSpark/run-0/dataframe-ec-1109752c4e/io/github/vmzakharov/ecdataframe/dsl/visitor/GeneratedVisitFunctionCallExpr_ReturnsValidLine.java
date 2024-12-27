package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVisitFunctionCallExpr_ReturnsValidLine {

    @Mock
    private Printer printer;

    @Test
    public void visitFunctionCallExpr_ReturnsValidLine() {
        when(printer.print(anyString())).thenReturn("func(x)");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        String result = visitor.visitFunctionCallExpr(new FunctionCallExpression("x"));
        assertEquals("func(x)", result);
    }

}