package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.util.Map;

public class GeneratedDoFormatNonCssContentTest {

    @Test
    public void doFormatNonCssContentTest() throws Exception {
        CssFormatter formatter = new CssFormatter();
        String code = "Hello World!";
        String expectedOutput = "Hello World!";
        assertEquals(expectedOutput, formatter.doFormat(code + "\n", LineEnding.LF));
    }

}