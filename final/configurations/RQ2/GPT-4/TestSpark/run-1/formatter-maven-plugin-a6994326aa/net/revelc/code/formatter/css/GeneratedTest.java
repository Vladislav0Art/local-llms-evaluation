package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        formatter.init(options, cfg);
        boolean result = formatter.isInitialized();
        assertEquals(true, result);
    }

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.doFormat("#style { color: red; }", LineEnding.CRLF);
    }

}