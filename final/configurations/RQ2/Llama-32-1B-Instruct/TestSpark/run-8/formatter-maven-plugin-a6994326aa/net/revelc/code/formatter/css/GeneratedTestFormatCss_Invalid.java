package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFormatCss_Invalid {

    @Test
    public void testFormatCss_Invalid() throws IOException {
        InputSource source = new InputSource(new StringReader("invalid-rule"));
        CsStyleFormatter formatter = new CsStyleFormatter();
        String expectedCssCode = "body {\n  invalid-rule;\n}";
        assertEquals(expectedCssCode, formatter.doFormat(source));
    }

}