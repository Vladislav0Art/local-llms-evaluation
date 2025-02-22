package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Map;
import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void testInit() {
        var options = new HashMap<String, String>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        var cfg = Mockito.mock(ConfigurationSource.class);
        var formatter = new CssFormatter();
        formatter.init(options, cfg);

        assertEquals(4, formatter.formatter.getIndent());
        assertTrue(formatter.formatter.isRgbAsHex());
        assertFalse(formatter.formatter.isUseSourceStringValues());
    }

    @Test
    public void testInitWithDefault() {
        var options = new HashMap<String, String>();
        var cfg = Mockito.mock(ConfigurationSource.class);
        var formatter = new CssFormatter();
        formatter.init(options, cfg);

        assertEquals(0, formatter.formatter.getIndent());
        assertFalse(formatter.formatter.isRgbAsHex());
        assertTrue(formatter.formatter.isUseSourceStringValues());
    }

}