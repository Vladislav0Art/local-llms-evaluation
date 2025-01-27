package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedToString_PrinterToString {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();

    @Test
    public void toString_PrinterToString() {
        assertEquals(printer.toString(), printer.toString());
    }

}