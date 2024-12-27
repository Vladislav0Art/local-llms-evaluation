package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedPrettyPrintVisitorConstructorPrinterTest {

    @Test
    public void PrettyPrintVisitorConstructorPrinterTest() {
        Printer newPrinter = new Printer();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        assertEquals(PrettyPrintVisitor.class, visitor.getClass());
    }

}