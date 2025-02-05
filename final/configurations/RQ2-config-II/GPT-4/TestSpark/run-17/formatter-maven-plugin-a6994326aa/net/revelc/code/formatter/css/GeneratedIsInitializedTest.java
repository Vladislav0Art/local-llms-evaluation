package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.junit.Test;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
        formatter.init(new HashMap<>(), new ConfigurationSource());
        assertFalse(formatter.isInitialized());
        Map<String, String> options = new HashMap<>();
        options.put("id", "value");
        formatter.init(options, new ConfigurationSource());
        assertTrue(formatter.isInitialized());
    }

}