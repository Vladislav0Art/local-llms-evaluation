package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVisitDecimalExpr_ReturnsValidLine {

    @Mock
    private Printer printer;

    @Test
    public void visitDecimalExpr_ReturnsValidLine() {
        when(printer.print(anyString())).thenReturn("1.5");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        String result = visitor.visitDecimalExpr(new DecimalExpression(1, 5));
        assertEquals("1.5", result);
    }

}