package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void initDefaultParametersTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();

        formatter.init(options, cfg);

        assertTrue(formatter.isInitialized());
    }

    @Test
    public void initNullParametersTest() {
        CssFormatter formatter = new CssFormatter();

        formatter.init(null, null);

        assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatValidCodeAndEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body{color: black;background: white;}";
        LineEnding ending = LineEnding.AUTO;

        String formattedCode = formatter.doFormat(code, ending);

        assertEquals("body { color: black; background: white; }", formattedCode);
    }

    @Test
    public void doFormatInvalidCodeAndEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "Invalid CSS code";
        LineEnding ending = LineEnding.AUTO;

        String formattedCode = formatter.doFormat(code, ending);

        assertEquals("", formattedCode);
    }

    @Test
    public void doFormatNullCodeAndEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();

        formatter.doFormat(null, null);
    }

    @Test
    public void isInitializedAfterInitTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();

        formatter.init(options, cfg);

        assertTrue(formatter.isInitialized());
    }

    @Test
    public void isInitializedWithoutInitTest() {
        CssFormatter formatter = new CssFormatter();

        assertFalse(formatter.isInitialized());
    }

}