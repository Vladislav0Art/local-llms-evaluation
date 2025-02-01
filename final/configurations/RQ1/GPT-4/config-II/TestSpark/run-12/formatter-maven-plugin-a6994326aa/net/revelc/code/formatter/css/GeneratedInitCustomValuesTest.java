package net.revelc.code.formatter.css;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedInitCustomValuesTest {

    @Test
    public void initCustomValuesTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        Mockito.when(cfg.getEncoding()).thenReturn("UTF-8");
        Mockito.when(cfg.getProperties()).thenReturn(new Properties());
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

}