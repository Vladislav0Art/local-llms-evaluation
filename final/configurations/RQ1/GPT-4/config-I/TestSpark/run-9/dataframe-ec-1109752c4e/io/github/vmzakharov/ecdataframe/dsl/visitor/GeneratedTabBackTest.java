package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTabBackTest {

    @Test
    public void tabBackTest() {
        Printer printerMock = Mockito.mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printerMock);

        // increase tab offset twice
        prettyPrintVisitor.tab();
        prettyPrintVisitor.tab();

        // decrease tab offset
        prettyPrintVisitor.tabBack();

        // try to print to check offset
        prettyPrintVisitor.print("Test");

        // it should print with 2 space offset
        Mockito.verify(printerMock).print("  Test");
    }

}