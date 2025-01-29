package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFormatCss_EqualProperties {

    @Test
    public void testFormatCss_EqualProperties() throws IOException {
        InputSource source = new InputSource(new StringReader("color: #ffffff\nfont-size: 12px;\nbody {\n  color: #000;\n  font-size: 14px;\n}"));
        CsStyleFormatter formatter = new CsStyleFormatter();
        String expectedCssCode = "body {\n  color: #000;\n  font-size: 14px;\n}";
        assertEquals(expectedCssCode, formatter.doFormat(source));
    }

}