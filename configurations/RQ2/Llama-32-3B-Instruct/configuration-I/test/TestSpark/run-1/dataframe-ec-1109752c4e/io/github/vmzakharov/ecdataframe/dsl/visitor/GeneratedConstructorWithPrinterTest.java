package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedConstructorWithPrinterTest {

    @Test
    public void constructorWithPrinterTest() {
        Printer printer = new Printer();
        when(printer.println(anyString())).thenReturn(null);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        assertNotNull(visitor);
    }

}