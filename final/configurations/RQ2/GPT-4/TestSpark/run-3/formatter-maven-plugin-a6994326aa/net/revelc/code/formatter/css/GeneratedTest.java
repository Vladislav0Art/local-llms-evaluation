package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ConfigurationSource cfg;

    @Test
    public void initValidOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        options.put("option2", "value2");

        formatter.init(options, cfg);

        assertEquals(true, formatter.isInitialized());
    }

    @Test
    public void initEmptyOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();

        formatter.init(options, cfg);

        assertEquals(true, formatter.isInitialized());
    }

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        options.put("option2", "value2");

        formatter.init(options, cfg);

        String code = ".example { display: none; }";
        String formattedCode = formatter.doFormat(code, LineEnding.AUTO);

        assertNotNull(formattedCode);
    }

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        options.put("option2", "value2");

        formatter.init(options, cfg);

        String code = ".example { display: )"; // invalid css code
        formatter.doFormat(code, LineEnding.AUTO);
    }

    @Test
    public void isInitializedBeforeInitTest() {
        CssFormatter formatter = new CssFormatter();

        assertEquals(false, formatter.isInitialized());
    }

}