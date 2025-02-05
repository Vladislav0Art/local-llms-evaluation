package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTest {

    @Test
    public void initNoOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource("Path");

        formatter.init(options, cfg);

        assertTrue(formatter.isInitialized());
    }

    @Test
    public void initWithOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        ConfigurationSource cfg = new ConfigurationSource("Path");

        formatter.init(options, cfg);

        assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatWithLfEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color: #000; }";
        String formattedCode = formatter.doFormat(code, LineEnding.LF);

        assertEquals(code, formattedCode);
    }

    @Test
    public void doFormatWithCrLfEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color: #000; }";
        String formattedCode = formatter.doFormat(code, LineEnding.CRLF);

        assertEquals(code, formattedCode);
    }

    @Test
    public void doFormatWithInvalidCodeThrowsExceptionTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color #000; }"; // Missing ":" causes a parsing error
        formatter.doFormat(code, LineEnding.CRLF);
    }

    @Test
    public void isInitializedFalseByDefaultTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

}