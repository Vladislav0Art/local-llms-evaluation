package net.revelc.code.formatter.css;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedTest {

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");

        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);

        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(options, cfg);

        assertTrue("Formatter should be initialized", cssFormatter.isInitialized());
    }

    @Test
    public void doFormatTest() throws Exception {
        String originalCode = "body {\nbackground-color: #fff; }";
        String expectedCode = "body {\\n background-color: #ffffff; }";

        CssFormatter cssFormatter = new CssFormatter();

        // Initializing formatter.
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(options, cfg);

        String returnedCode = cssFormatter.doFormat(originalCode, LineEnding.AUTO);

        assertEquals("Formatted code is not as expected", expectedCode, returnedCode);
    }

    @Test
    public void doFormatReturnNullTest() throws Exception {
        String originalCode = "body {\\n background-color: #ffffff; }";

        CssFormatter cssFormatter = new CssFormatter();

        // Initializing formatter.
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(options, cfg);

        String returnedCode = cssFormatter.doFormat(originalCode, LineEnding.AUTO);

        assertNull("Return code should be null", returnedCode);
    }

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();

        // Before initialization.
        boolean isInitialized = cssFormatter.isInitialized();
        assertTrue("Formatter should not be initialized yet", !isInitialized);

        // After initialization.
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(options, cfg);

        isInitialized = cssFormatter.isInitialized();
        assertTrue("Formatter should be initialized", isInitialized);
    }

}