package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFormatCss_InvalidString {

    @Test
    public void testFormatCss_InvalidString() throws IOException {
        InputSource source = new InputSource(new StringReader("invalid-rule"));
        CsStyleFormatter formatter = new CsStyleFormatter();
        String expectedCssCode = "body {\n  invalid-rule;\n}";
        assertEquals(expectedCssCode, formatter.doFormat(source));
    }

}