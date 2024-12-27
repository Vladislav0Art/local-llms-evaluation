package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVisitConstExpr_ReturnsValidLine {

    @Mock
    private Printer printer;

    @Test
    public void visitConstExpr_ReturnsValidLine() {
        when(printer.print(anyString())).thenReturn("5");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        String result = visitor.visitConstExpr(new Value(5));
        assertEquals("5", result);
    }

}