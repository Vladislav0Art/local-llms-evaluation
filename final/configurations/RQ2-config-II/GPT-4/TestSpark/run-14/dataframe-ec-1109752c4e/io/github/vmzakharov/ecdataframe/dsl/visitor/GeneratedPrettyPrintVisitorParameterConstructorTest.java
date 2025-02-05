package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedPrettyPrintVisitorParameterConstructorTest {

    @Test
    public void PrettyPrintVisitorParameterConstructorTest() {
        Printer printer = PrinterFactory.newPrinter();
        PrettyPrintVisitor ppvisitor = new PrettyPrintVisitor(printer);
        assertNotEquals(ppvisitor, null);
    }

}