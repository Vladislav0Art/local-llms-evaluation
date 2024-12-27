package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVisitPropertyPathExpr_ReturnsValidLine {

    @Mock
    private Printer printer;

    @Test
    public void visitPropertyPathExpr_ReturnsValidLine() {
        when(printer.print(anyString())).thenReturn("data.x");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        String result = visitor.visitPropertyPathExpr(new PropertyPathExpression("x", "data"));
        assertEquals("data.x", result);
    }

}