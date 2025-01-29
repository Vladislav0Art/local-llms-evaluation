package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFormatCss_Simple {

    @Test
    public void testFormatCss_Simple() throws IOException {
        CsStyleFormatter formatter = new CsStyleFormatter();
        String expectedCssCode = "body {\n  background-color: #ffffff;\n}";
        assertEquals(expectedCssCode, formatter.doFormat(""));
    }

}