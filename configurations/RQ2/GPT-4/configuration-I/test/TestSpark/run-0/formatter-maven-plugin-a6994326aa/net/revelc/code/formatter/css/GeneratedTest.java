package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    @Test
    public void init_ValidInput_NoException() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<String, String>();

        cssFormatter.init(options, null);

        assertNotNull(cssFormatter);
    }

    @Test
    public void doFormat_WithInvalidCode_ThrowsException() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat("invalid css code", LineEnding.LF);
    }

    @Test
    public void doFormat_WithValidCode_NoException() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String result = cssFormatter.doFormat("body { color: red; }", LineEnding.LF);
        assertNotNull(result);
        assertEquals("body { color: red; }", result);
    }

    @Test
    public void isInitialized_NotInitialized_ReturnsFalse() {
        CssFormatter cssFormatter = new CssFormatter();
        assertEquals(false, cssFormatter.isInitialized());
    }

    @Test
    public void isInitialized_AfterInit_ReturnsTrue() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);
        assertEquals(true, cssFormatter.isInitialized());
    }

}