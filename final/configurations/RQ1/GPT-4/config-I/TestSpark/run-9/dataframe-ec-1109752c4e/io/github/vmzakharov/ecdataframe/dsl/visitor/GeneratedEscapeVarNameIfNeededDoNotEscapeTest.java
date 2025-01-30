package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedEscapeVarNameIfNeededDoNotEscapeTest {

    @Test
    public void escapeVarNameIfNeededDoNotEscapeTest() {
        Printer printerMock = Mockito.mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printerMock);

        String result = prettyPrintVisitor.escapeVarNameIfNeeded("varName", false);

        Assert.assertEquals("varName", result);
    }

}