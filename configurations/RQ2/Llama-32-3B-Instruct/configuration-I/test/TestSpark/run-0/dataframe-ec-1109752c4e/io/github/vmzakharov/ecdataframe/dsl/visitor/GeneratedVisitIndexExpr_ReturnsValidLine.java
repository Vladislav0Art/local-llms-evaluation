package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVisitIndexExpr_ReturnsValidLine {

    @Mock
    private Printer printer;

    @Test
    public void visitIndexExpr_ReturnsValidLine() {
        when(printer.print(anyString())).thenReturn("data[0]");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        String result = visitor.visitIndexExpr(new IndexExpression(0, "data"));
        assertEquals("data[0]", result);
    }

}