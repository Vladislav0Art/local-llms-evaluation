package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testFormatCss_Simple() throws IOException {
        CsStyleFormatter formatter = new CsStyleFormatter();
        String expectedCssCode = "body {\n  background-color: #ffffff;\n}";
        assertEquals(expectedCssCode, formatter.doFormat(""));
    }

    @Test
    public void testFormatCss_Invalid() throws IOException {
        InputSource source = new InputSource(new StringReader("invalid-rule"));
        CsStyleFormatter formatter = new CsStyleFormatter();
        String expectedCssCode = "body {\n  invalid-rule;\n}";
        assertEquals(expectedCssCode, formatter.doFormat(source));
    }

    @Test
    public void testFormatCss_EqualProperties() throws IOException {
        InputSource source = new InputSource(new StringReader("color: #ffffff\nfont-size: 12px;\nbody {\n  color: #000;\n  font-size: 14px;\n}"));
        CsStyleFormatter formatter = new CsStyleFormatter();
        String expectedCssCode = "body {\n  color: #000;\n  font-size: 14px;\n}";
        assertEquals(expectedCssCode, formatter.doFormat(source));
    }

    @Test
    public void testFormatCss_InvalidProperties() throws IOException {
        InputSource source = new InputSource(new StringReader("invalid-property: value;"));
        CsStyleFormatter formatter = new CsStyleFormatter();
        String expectedCssCode = "body {\n  invalid-property: value;\n}";
        assertEquals(expectedCssCode, formatter.doFormat(source));
    }

    @Test
    public void testFormatCss_EmptyString() throws IOException {
        CsStyleFormatter formatter = new CsStyleFormatter();
        String expectedCssCode = "";
        assertEquals(expectedCssCode, formatter.doFormat(""));
    }

    @Test
    public void testFormatCss_InvalidString() throws IOException {
        InputSource source = new InputSource(new StringReader("invalid-rule"));
        CsStyleFormatter formatter = new CsStyleFormatter();
        String expectedCssCode = "body {\n  invalid-rule;\n}";
        assertEquals(expectedCssCode, formatter.doFormat(source));
    }

    @Test
    public void testFormatCss_InvalidCharacter() throws IOException {
        InputSource source = new InputSource(new StringReader("invalid-character"));
        CsStyleFormatter formatter = new CsStyleFormatter();
        String expectedCssCode = "body {\n  invalid-character;\n}";
        assertEquals(expectedCssCode, formatter.doFormat(source));
    }

}