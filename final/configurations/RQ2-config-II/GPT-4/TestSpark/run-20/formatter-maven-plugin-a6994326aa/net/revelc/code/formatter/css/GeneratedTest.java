package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void initWithEmptyOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<String, String>(), null);
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initWithNullOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(null, null);
    }

    @Test
    public void doFormatWithEmptyCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String result = cssFormatter.doFormat("", LineEnding.AUTO);
        assertEquals("", result);
    }

    @Test
    public void doFormatWithValidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String result = cssFormatter.doFormat("body {background-color: lightblue;}", LineEnding.CRLF);
        assertEquals("body {background-color: lightblue;\r\n}", result);
    }

    @Test
    public void doFormatWithInvalidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat("body {background-color: lightblue;", LineEnding.CR);
    }

    @Test
    public void isInitializedBeforeInitTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertFalse(cssFormatter.isInitialized());
    }

    @Test
    public void isInitializedAfterInitTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<String, String>(), null);
        assertTrue(cssFormatter.isInitialized());
    }

}