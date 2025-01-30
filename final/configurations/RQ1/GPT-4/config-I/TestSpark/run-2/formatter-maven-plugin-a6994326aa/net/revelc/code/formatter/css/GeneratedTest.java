package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");

        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initFormatExceptionTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "notANumber");

        cssFormatter.init(options, null);
    }

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");

        cssFormatter.init(options, null);

        String code = "body {color : black;}";
        String expected = "body {\n  color: black;\n}";

        assertEquals(expected, cssFormatter.doFormat(code, null));
    }

    @Test
    public void doFormatWithTabTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");

        cssFormatter.init(options, null);

        String code = "body {\\9;color : black;}";
        String expected = "body {\n  \\9;\n  color: black;\n}";

        assertEquals(expected, cssFormatter.doFormat(code, null));
    }

    @Test
    public void doFormatNoChangeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");

        cssFormatter.init(options, null);

        String code = "body {\n  color: black;\n}";

        assertNull(cssFormatter.doFormat(code, null));
    }

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertFalse(cssFormatter.isInitialized());

        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");

        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

}