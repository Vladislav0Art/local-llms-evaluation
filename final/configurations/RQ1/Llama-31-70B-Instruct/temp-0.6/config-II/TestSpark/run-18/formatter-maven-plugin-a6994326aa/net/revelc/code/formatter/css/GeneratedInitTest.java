package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        ConfigurationSource cfg = null;
        cssFormatter.init(options, cfg);
        assertEquals(cssFormatter.formatter.getPropertiesInSeparateLines(), 4);
        assertTrue(cssFormatter.formatter.isRgbAsHex());
        assertTrue(cssFormatter.formatter.isUseSourceStringValues());
    }

}