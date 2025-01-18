package net.revelc.code.formatter.css;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void initValidOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        options.put("option2", "value2");
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);

        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void initEmptyOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);

        formatter.init(options, cfg);
        assertFalse(formatter.isInitialized());
    }

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        options.put("option2", "value2");
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        formatter.init(options, cfg);

        String code = ".class { color : black; }";
        LineEnding ending = LineEnding.CRLF;
        String formattedCode = formatter.doFormat(code, ending);

        assertEquals(code, formattedCode);
    }

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        options.put("option2", "value2");
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        formatter.init(options, cfg);

        String code = ".class { color : black; ";
        LineEnding ending = LineEnding.CRLF;
        formatter.doFormat(code, ending);
    }

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());

        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        options.put("option2", "value2");
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        formatter.init(options, cfg);

        assertTrue(formatter.isInitialized());
    }

}