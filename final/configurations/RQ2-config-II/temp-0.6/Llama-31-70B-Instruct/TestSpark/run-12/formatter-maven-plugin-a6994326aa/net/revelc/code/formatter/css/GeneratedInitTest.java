package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInitTest {

    private static final String DUMMY_CODE = "dummy code";
    private static final String DUMMY_CONFIG_KEY = "key";
    private static final String DUMMY_CONFIG_VALUE = "value";
    private static final Map<String, String> OPTIONS = new HashMap<>();
    private static final ConfigurationSource CONFIG_SOURCE = new ConfigurationSource() {
        @Override
        public String getConfiguration(String key) {
            return null;
        }
    };

    @Test
    public void initTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(OPTIONS, CONFIG_SOURCE);
        assertNotNull(formatter);
    }

}