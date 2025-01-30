package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class GeneratedInitPropertiesPresentTest {

    @Test
    public void initPropertiesPresentTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "5");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");
        formatter.init(options, null);
        assertTrue(formatter.isInitialized());
    }

}