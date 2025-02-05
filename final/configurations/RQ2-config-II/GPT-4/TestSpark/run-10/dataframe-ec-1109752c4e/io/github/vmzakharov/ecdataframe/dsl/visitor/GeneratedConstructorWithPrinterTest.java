package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;

public class GeneratedConstructorWithPrinterTest {

    @Test
    public void ConstructorWithPrinterTest() {
        Printer printer = mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertNotNull(visitor);
    }

}