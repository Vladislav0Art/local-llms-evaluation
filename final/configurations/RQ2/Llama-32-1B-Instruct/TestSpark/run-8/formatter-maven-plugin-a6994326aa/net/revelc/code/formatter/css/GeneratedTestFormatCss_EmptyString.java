package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFormatCss_EmptyString {

    @Test
    public void testFormatCss_EmptyString() throws IOException {
        CsStyleFormatter formatter = new CsStyleFormatter();
        String expectedCssCode = "";
        assertEquals(expectedCssCode, formatter.doFormat(""));
    }

}