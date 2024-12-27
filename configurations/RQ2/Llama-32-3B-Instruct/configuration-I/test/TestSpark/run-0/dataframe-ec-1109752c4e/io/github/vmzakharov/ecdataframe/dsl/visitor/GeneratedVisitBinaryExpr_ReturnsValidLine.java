package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVisitBinaryExpr_ReturnsValidLine {

    @Mock
    private Printer printer;

    @Test
    public void visitBinaryExpr_ReturnsValidLine() {
        when(printer.print(anyString())).thenReturn("(x + 1) * 2");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        String result = visitor.visitBinaryExpr(new BinaryExpression("x", "+", 1, 2));
        assertEquals("(x + 1) * 2", result);
    }

}