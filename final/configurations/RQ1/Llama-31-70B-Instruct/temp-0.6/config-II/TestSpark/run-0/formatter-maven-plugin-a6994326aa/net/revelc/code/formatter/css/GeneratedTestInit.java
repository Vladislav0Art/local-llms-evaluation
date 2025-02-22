package net.revelc.code.formatter.css;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import net.revelc.code.formatter.Formatter;
import org.junit.Test;

public class GeneratedTestInit {

    private CssFormatter formatter;

    @Test
    public void testInit() {
        formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        ConfigurationSource cfg = new ConfigurationSource();
        formatter.init(options, cfg);
        assertNotNull(formatter.formatter);
    }

}