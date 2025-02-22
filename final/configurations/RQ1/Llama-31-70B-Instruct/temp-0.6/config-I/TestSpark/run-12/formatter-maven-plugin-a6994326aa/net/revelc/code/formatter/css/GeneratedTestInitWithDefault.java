package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Map;
import java.util.HashMap;

public class GeneratedTestInitWithDefault {

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