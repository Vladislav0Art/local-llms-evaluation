package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInitTestWithConfiguration {

    @Test
    public void initTestWithConfiguration() {
        CssFormatter formatter = new CssFormatter();
        ConfigurationSource cfg = new ConfigurationSource();
        Map<String, String> options = new HashMap<>();
        options.put("indent_size", "2");
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

}