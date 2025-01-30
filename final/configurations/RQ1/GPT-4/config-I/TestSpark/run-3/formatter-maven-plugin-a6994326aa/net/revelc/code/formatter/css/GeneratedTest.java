package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        cssFormatter.init(options, null);
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initDefaultOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        cssFormatter.init(options, null);
        String code = "body { background-color: red; }";
        String formattedCode = cssFormatter.doFormat(code, LineEnding.AUTO);
        assertNotNull(formattedCode);
        assertNotEquals(code, formattedCode);
    }

    @Test
    public void doFormatWithTabsTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);
        String code = "body {\tbackground-color: red;\t}";
        String formattedCode = cssFormatter.doFormat(code, LineEnding.AUTO);
        assertNotNull(formattedCode);
        assertTrue(formattedCode.contains("\\9;"));
    }

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertFalse(cssFormatter.isInitialized());
    }

    @Test
    public void isInitializedAfterInitTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);
        assertTrue(cssFormatter.isInitialized());
    }

}