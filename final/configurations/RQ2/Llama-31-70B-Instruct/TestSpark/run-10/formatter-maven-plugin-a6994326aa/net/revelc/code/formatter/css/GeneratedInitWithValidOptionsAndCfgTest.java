package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedInitWithValidOptionsAndCfgTest {

    @Test
    public void initWithValidOptionsAndCfgTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("key1", "value1");
        options.put("key2", "value2");
        ConfigurationSource cfg = new ConfigurationSource() {
            @Override
            public String getProperty(String key) {
                return "value";
            }
        };
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

}