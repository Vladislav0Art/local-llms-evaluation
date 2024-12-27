package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVisitIfElseExpr_ReturnsValidLine {

    @Mock
    private Printer printer;

    @Test
    public void visitIfElseExpr_ReturnsValidLine() {
        when(printer.print(anyString())).thenReturn("if x > 0: return x");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        String result = visitor.visitIfElseExpr(new IfElseExpression(1, new Expression()));
        assertEquals("if x > 0: return x", result);
    }

}