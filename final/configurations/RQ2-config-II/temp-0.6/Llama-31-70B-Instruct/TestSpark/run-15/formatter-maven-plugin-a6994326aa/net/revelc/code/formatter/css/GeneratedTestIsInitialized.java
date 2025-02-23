package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

public class GeneratedTestIsInitialized {

    @Test
    public void testIsInitialized() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        formatter.init(options, null);
        assertTrue(formatter.isInitialized());
    }

}