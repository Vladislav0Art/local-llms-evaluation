package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTest {

    private CssFormatter formatter;

    @Test
    public void initTest() {
        formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("key", "value");
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatWithEndingTest() throws IOException {
        formatter = new CssFormatter();
        String code = "test code";
        LineEnding ending = LineEnding.UNIX;
        String formattedCode = formatter.doFormat(code, ending);
        assertEquals(code, formattedCode);
    }

    @Test
    public void doFormatWithoutEndingTest() throws IOException {
        formatter = new CssFormatter();
        String code = "test code";
        String formattedCode = formatter.doFormat(code);
        assertEquals(code, formattedCode);
    }

    @Test
    public void isInitializedTest() {
        formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

}