package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;

public class GeneratedTestInit {

    private CssFormatter cssFormatter;

    @Test
    public void testInit() {
        Map<String, String> options = Map.of("indent", "4", "rgbAsHex", "true", "useSourceStringValues", "false");
        ConfigurationSource cfg = null;
        cssFormatter = new CssFormatter();
        cssFormatter.init(options, cfg);
        assertNotEquals(null, cssFormatter.getFormatter());
    }

}