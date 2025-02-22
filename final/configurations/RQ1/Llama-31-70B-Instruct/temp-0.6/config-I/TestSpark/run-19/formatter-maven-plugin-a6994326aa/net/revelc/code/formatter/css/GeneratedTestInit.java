package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Map;

import com.steadystate.css.format.CSSFormat;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestInit {

    private CssFormatter cssFormatter;

    @Before
    public void setup() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void testInit() {
        Map<String, String> options = mock(Map.class);
        ConfigurationSource cfg = mock(ConfigurationSource.class);

        when(options.getOrDefault("indent", "4")).thenReturn("4");
        when(options.getOrDefault("rgbAsHex", Boolean.TRUE.toString())).thenReturn(Boolean.TRUE.toString());
        when(options.getOrDefault("useSourceStringValues", Boolean.FALSE.toString())).thenReturn(Boolean.FALSE.toString());

        cssFormatter.init(options, cfg);

        assertTrue(cssFormatter.isInitialized());
    }

}