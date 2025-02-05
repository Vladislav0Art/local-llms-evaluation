package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedDoFormatWithEmptyCodeTest {

    @Test
    public void doFormatWithEmptyCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String result = cssFormatter.doFormat("", LineEnding.AUTO);
        assertEquals("", result);
    }

}