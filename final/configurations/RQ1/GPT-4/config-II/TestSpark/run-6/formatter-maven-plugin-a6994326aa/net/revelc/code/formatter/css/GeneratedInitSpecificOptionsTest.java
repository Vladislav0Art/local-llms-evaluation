package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedInitSpecificOptionsTest {

    @Test
    public void initSpecificOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");
        formatter.init(options, null);
        assertTrue(formatter.isInitialized());
    }

}