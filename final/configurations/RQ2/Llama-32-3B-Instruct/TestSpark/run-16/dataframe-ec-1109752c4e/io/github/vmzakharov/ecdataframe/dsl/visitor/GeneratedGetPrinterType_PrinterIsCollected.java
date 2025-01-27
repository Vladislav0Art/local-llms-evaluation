package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetPrinterType_PrinterIsCollected {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();

    @Test
    public void getPrinterType_PrinterIsCollected() {
        Printer printer = factory.createPrinter();
        assertEquals(Printer.Collecting.class, printer.getClass());
    }
}

}