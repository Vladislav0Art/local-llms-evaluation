package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInitTest {

    @Test
    public void InitTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertFalse(cssFormatter.isInitialized());

        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

}