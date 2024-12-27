package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVisitAssignExpr_ReturnsValidLine {

    @Mock
    private Printer printer;

    @Test
    public void visitAssignExpr_ReturnsValidLine() {
        when(printer.print(anyString())).thenReturn("x = 5");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        String result = visitor.visitAssignExpr(new AssigningExpr("x", 5));
        assertEquals("x = 5", result);
    }

}