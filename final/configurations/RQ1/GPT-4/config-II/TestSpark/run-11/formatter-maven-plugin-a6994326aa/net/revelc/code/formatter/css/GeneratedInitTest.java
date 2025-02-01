package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.util.HashMap;
import java.util.Map;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        ConfigurationSource cfg = new ConfigurationSource();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

}