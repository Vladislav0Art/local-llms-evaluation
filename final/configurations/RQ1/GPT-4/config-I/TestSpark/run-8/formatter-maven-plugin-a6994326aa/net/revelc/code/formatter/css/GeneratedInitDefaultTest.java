package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInitDefaultTest {

    @Test
    public void initDefaultTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
        ConfigurationSource configSource = null;
        Map<String, String> options = new HashMap<>();
        formatter.init(options, configSource);
        assertTrue(formatter.isInitialized());
    }

}