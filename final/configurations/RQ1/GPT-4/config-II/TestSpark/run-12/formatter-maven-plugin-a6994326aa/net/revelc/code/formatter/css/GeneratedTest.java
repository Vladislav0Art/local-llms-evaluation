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

public class GeneratedTest {

    @Test
    public void initDefaultValuesTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        Mockito.when(cfg.getEncoding()).thenReturn("UTF-8");
        Mockito.when(cfg.getProperties()).thenReturn(new Properties());
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

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

    @Test
    public void doFormatEmptyCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        Mockito.when(cfg.getEncoding()).thenReturn("UTF-8");
        Mockito.when(cfg.getProperties()).thenReturn(new Properties());
        cssFormatter.init(options, cfg);
        assertNull(cssFormatter.doFormat("", LineEnding.AUTO));
    }

    @Test
    public void doFormatValidCssTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        Mockito.when(cfg.getEncoding()).thenReturn("UTF-8");
        Mockito.when(cfg.getProperties()).thenReturn(new Properties());
        cssFormatter.init(options, cfg);
        String code = ".body {\n color: #fff;\n}\n";
        assertNotNull(cssFormatter.doFormat(code, LineEnding.AUTO));
    }

    @Test
    public void doFormatInvalidCssTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        Mockito.when(cfg.getEncoding()).thenReturn("UTF-8");
        Mockito.when(cfg.getProperties()).thenReturn(new Properties());
        cssFormatter.init(options, cfg);
        assertEquals(cssFormatter.doFormat("invalid css code", LineEnding.AUTO), "invalid css code");
    }

    @Test
    public void isInitializedFalseTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertFalse(cssFormatter.isInitialized());
    }

}