package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTest {

    @Test
    public void initBasicEmptyOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<String, String>(), null);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void initTestWithConfiguration() {
        CssFormatter formatter = new CssFormatter();
        ConfigurationSource cfg = new ConfigurationSource();
        Map<String, String> options = new HashMap<>();
        options.put("indent_size", "2");
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void isInitializedFalseTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

    @Test
    public void isInitializedTrueTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<String, String>(), null);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatNullInputTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<String, String>(), null);
        formatter.doFormat(null, LineEnding.AUTO);
    }

    @Test
    public void doFormatEmptyStringTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<String, String>(), null);
        formatter.doFormat("", LineEnding.AUTO);
    }

    @Test
    public void doFormatTestWithSampleCode() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<String, String>(), null);
        String result = formatter.doFormat("body{background-color:#ffffff;}", LineEnding.AUTO);
        assertEquals("body {\n    background-color: #ffffff;\n}\n", result);
    }

}