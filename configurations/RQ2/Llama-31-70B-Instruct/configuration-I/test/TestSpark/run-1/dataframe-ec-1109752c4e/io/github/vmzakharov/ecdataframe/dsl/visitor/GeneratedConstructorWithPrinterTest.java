package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedConstructorWithPrinterTest {

    @Test
    public void constructorWithPrinterTest() {
        Printer printer = mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        assertNotNull(prettyPrintVisitor);
    }

}