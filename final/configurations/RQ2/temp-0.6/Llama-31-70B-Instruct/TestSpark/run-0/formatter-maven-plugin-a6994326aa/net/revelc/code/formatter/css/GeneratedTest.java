package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTest {

    private CssFormatter formatter;

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        options.put("key1", "value1");
        options.put("key2", "value2");
        // Create a dummy ConfigurationSource instance
        ConfigurationSource cfg = new ConfigurationSource() {
            @Override
            public String getProperty(String key, String defaultValue) {
                return null;
            }
        };
        formatter = new CssFormatter();
        formatter.init(options, cfg);
    }

    @Test
    public void doFormatTest() throws IOException {
        String code = "body { margin: 0; }";
        LineEnding ending = LineEnding.LF;
        formatter = new CssFormatter();
        String formattedCode = formatter.doFormat(code, ending);
        assertNotNull(formattedCode);
    }

    @Test
    public void isInitializedTest() {
        formatter = new CssFormatter();
        boolean initialized = formatter.isInitialized();
        assertTrue(initialized);
    }

}