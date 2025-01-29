package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFormatCss_InvalidCharacter {

    @Test
    public void testFormatCss_InvalidCharacter() throws IOException {
        InputSource source = new InputSource(new StringReader("invalid-character"));
        CsStyleFormatter formatter = new CsStyleFormatter();
        String expectedCssCode = "body {\n  invalid-character;\n}";
        assertEquals(expectedCssCode, formatter.doFormat(source));
    }

}