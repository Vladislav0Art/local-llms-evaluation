package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCreatePrinter_PrinterCreatedCorrectly {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();

    @Test
    public void createPrinter_PrinterCreatedCorrectly() {
        Printer printer = factory.createPrinter();
        assertNotNull(printer);
    }

}