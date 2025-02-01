package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInitDefaultOptionsTest {

    @Test
    public void initDefaultOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource(LineEnding.CRLF, options);

        assertFalse(cssFormatter.isInitialized());

        cssFormatter.init(options, cfg);

        assertTrue(cssFormatter.isInitialized());
    }

}