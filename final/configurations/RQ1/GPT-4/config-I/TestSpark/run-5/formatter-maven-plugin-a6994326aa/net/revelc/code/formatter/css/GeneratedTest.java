package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void initStandardOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initCustomOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");
        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void isInitializedTrueTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormattingTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);
        String code = "body {background-color: black; color: white}\n" +
                "h1   {color: #36CFFF; }";
        String formattedCode = cssFormatter.doFormat(code, null);

        assertNotEquals(code, formattedCode);
    }

    @Test
    public void doFormattingWithNoModificationTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);
        String code = "";
        String formattedCode = cssFormatter.doFormat(code, null);

        assertNull(formattedCode);
    }

}