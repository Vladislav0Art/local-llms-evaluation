package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVisitVarExprPrintsCorrectly {

    @Mock
    private Printer printer;

    @Mock
    private CollectingPrinter collectingPrinter;

    public void setup() {
        when(printer.printLine(anyString())).thenReturn(collectingPrinter);
        when(printer.printLineWithColor(anyString(), anyString())).thenReturn(collectingPrinter);
        when(printer.printLineWithDelimiter(anyString())).thenReturn(collectingPrinter);
    }

    @Test
    public void visitVarExprPrintsCorrectly() {
        setup();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitVarExpr(new VarExpr("x"));
        assertEquals("x\n", collectingPrinter.toString());
    }

}