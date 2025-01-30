package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNewLineTest {

    @Test
    public void newLineTest() {
        Printer printerMock = Mockito.mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printerMock);

        prettyPrintVisitor.newLine();

        Mockito.verify(printerMock, Mockito.times(1)).newLine();
    }

}