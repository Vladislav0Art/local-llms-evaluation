package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void initWithValidOptionsAndCfgTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("key1", "value1");
        options.put("key2", "value2");
        ConfigurationSource cfg = new ConfigurationSource() {
            @Override
            public String getProperty(String key) {
                return "test";
            }
        };
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void initWithNullOptionsAndCfgTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(null, null);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatWithValidCodeAndEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.UNIX;
        String formattedCode = formatter.doFormat(code, ending);
        assertNotNull(formattedCode);
        assertEquals(code, formattedCode);
    }

    @Test
    public void doFormatWithNullCodeAndEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.doFormat(null, null);
    }

}