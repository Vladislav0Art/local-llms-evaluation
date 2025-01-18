package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import org.junit.Test;

import static org.mockito.Mockito.verify;

public class GeneratedVisitConstructorWithPrinterTest {

    @Test
    public void visitConstructorWithPrinterTest() {
        Printer printer = Mockito.mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        assertNotNull(prettyPrintVisitor);
    }

}