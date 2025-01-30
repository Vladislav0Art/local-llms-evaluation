package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedInitDefaultTest {

    // Mock the ConfigurationSource object
    ConfigurationSource cfg = mock(ConfigurationSource.class);

    @Test
    public void initDefaultTest() {
        Map<String, String> options = new HashMap<>();
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

}