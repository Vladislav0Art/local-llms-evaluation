package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedInit_WithValidOptions_FormatterInitialized {

    @Test
    public void init_WithValidOptions_FormatterInitialized() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");

        CssFormatter formatter = new CssFormatter();
        formatter.init(options, null);

        assertNotNull(formatter.formatter);
    }

}