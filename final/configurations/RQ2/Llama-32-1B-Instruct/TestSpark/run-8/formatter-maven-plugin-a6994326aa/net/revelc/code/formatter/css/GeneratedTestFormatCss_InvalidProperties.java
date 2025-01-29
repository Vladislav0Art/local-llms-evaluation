package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFormatCss_InvalidProperties {

    @Test
    public void testFormatCss_InvalidProperties() throws IOException {
        InputSource source = new InputSource(new StringReader("invalid-property: value;"));
        CsStyleFormatter formatter = new CsStyleFormatter();
        String expectedCssCode = "body {\n  invalid-property: value;\n}";
        assertEquals(expectedCssCode, formatter.doFormat(source));
    }

}