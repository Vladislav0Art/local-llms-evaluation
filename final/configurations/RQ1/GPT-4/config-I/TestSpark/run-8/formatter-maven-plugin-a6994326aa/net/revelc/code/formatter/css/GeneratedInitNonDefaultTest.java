package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInitNonDefaultTest {

    @Test
    public void initNonDefaultTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
        ConfigurationSource configSource = null;
        Map<String, String> options = new HashMap<>();
        options.put("indent", "6");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");
        formatter.init(options, configSource);
        assertTrue(formatter.isInitialized());
    }

}