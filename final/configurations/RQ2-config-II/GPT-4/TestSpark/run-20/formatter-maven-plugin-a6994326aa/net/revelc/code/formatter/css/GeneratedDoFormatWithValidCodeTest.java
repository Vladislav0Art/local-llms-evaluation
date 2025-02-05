package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedDoFormatWithValidCodeTest {

    @Test
    public void doFormatWithValidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String result = cssFormatter.doFormat("body {background-color: lightblue;}", LineEnding.CRLF);
        assertEquals("body {background-color: lightblue;\r\n}", result);
    }

}