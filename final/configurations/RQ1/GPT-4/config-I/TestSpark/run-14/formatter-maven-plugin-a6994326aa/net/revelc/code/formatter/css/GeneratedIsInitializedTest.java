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

public class GeneratedIsInitializedTest {

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