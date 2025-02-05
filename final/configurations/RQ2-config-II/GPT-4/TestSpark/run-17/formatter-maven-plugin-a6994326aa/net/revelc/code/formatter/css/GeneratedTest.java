package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void initValidOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        ConfigurrationSource cfg = new ConfigurrationSource();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        options.put("option2", "value2");

        formatter.init(options, cfg);

        assertTrue(formatter.isInitialized());
    }

    @Test
    public void initNoOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        ConfigurrationSource cfg = new ConfigurrationSource();
        Map<String, String> options = new HashMap<>();

        formatter.init(options, cfg);

        assertFalse(formatter.isInitialized());
    }

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String formattedCode = formatter.doFormat("body {color: black;}", LineEnding.CRLF);

        assertEquals("body {\r\n\tcolor: black;\r\n}", formattedCode);
    }

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.doFormat("body {color: black;", LineEnding.CRLF);
    }

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
        formatter.init(new HashMap<>(), new ConfigurationSource());
        assertFalse(formatter.isInitialized());
        Map<String, String> options = new HashMap<>();
        options.put("id", "value");
        formatter.init(options, new ConfigurationSource());
        assertTrue(formatter.isInitialized());
    }

}