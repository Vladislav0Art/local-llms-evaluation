package net.revelc.code.formatter.css;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTest {

    @Test
    public void initDefaultOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initCustomOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatIdenticalTest() throws Exception {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);
        String cssCode = "body { font-size: 16px; }";
        assertNull(cssFormatter.doFormat(cssCode, LineEnding.LF));
    }

    @Test
    public void doFormatDifferentTest() throws Exception {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);

        String cssCode = "body{font-size:16px;}";
        assertNotNull(cssFormatter.doFormat(cssCode, LineEnding.LF));
    }

    @Test
    public void doFormatWithRgbAsHexOptionTest() throws Exception {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("rgbAsHex", "true");
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);

        String cssCode = "body{color:rgb(255, 255, 255);}";
        String expectedCssCode = "body{color:#ffffff;}";
        assertTrue(cssFormatter.doFormat(cssCode, LineEnding.LF).equals(expectedCssCode));
    }

    @Test
    public void isInitializedTrueTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void isInitializedFalseTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertTrue(!cssFormatter.isInitialized());
    }

}