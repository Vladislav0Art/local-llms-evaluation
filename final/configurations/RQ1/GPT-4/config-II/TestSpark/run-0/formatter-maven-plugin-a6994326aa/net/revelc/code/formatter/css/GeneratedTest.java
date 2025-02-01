package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void initDefaultOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);

        assertTrue("Formatter should be initialized.", formatter.isInitialized());
    }

    @Test
    public void initWithOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");

        formatter.init(options, null);

        assertTrue("Formatter should be initialized.", formatter.isInitialized());
    }

    @Test
    public void initWithInvalidIndentOptionTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "invalid");
        formatter.init(options, null);
    }

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse("Formatter should not be initialized.", formatter.isInitialized());
    }

    @Test
    public void doFormatReturnValueTest() throws Exception {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);

        String output = formatter.doFormat("body {color : black;}", LineEnding.UNIX);

        assertEquals("body {\n    color: black;\n}\n", output);
    }

    @Test
    public void doFormatReturnNullTest() throws Exception {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);

        String output = formatter.doFormat("body {\n    color: black;\n}\n", LineEnding.UNIX);

        assertEquals(null, output);
    }

}