package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = Mockito.mock(CssFormatter.class);
        Map<String, String> options = Mockito.mock(Map.class);
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        Mockito.when(options.getOrDefault("indent", "4")).thenReturn("4");
        Mockito.when(options.getOrDefault("rgbAsHex", Boolean.TRUE.toString())).thenReturn(Boolean.TRUE.toString());
        Mockito.when(options.getOrDefault("useSourceStringValues", Boolean.FALSE.toString())).thenReturn(Boolean.FALSE.toString());
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

}