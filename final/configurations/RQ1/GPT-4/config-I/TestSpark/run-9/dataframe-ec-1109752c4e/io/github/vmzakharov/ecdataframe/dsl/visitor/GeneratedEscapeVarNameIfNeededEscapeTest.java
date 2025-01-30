package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedEscapeVarNameIfNeededEscapeTest {

    @Test
    public void escapeVarNameIfNeededEscapeTest() {
        Printer printerMock = Mockito.mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printerMock);

        String result = prettyPrintVisitor.escapeVarNameIfNeeded("varName", true);

        Assert.assertEquals("${varName}", result);
    }

}