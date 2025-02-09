package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedDoFormatValidCodeTest {

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body {background-color: white;}";
        String formattedCode = formatter.doFormat(code, LineEnding.CRLF);
        assertEquals("body {background-color: white;}", formattedCode);
    }

}