package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void initValidOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indentSize", "4");
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);

        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void initEmptyOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);

        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void initNullOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);

        formatter.init(null, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body {background-color: white;}";
        String formattedCode = formatter.doFormat(code, LineEnding.CRLF);
        assertEquals("body {background-color: white;}", formattedCode);
    }

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body {background-color: ;}"; // missing color name
        formatter.doFormat(code, LineEnding.LF);
    }

    @Test
    public void isInitializedAfterInitTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);

        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void isInitializedBeforeInitTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

}