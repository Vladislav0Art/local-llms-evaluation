package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatValidCodeTest {

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String formattedCode = cssFormatter.doFormat("body {background-color: red;}", LineEnding.CRLF);

        Assert.assertEquals("body {background-color: red;}\r\n", formattedCode);
    }

}