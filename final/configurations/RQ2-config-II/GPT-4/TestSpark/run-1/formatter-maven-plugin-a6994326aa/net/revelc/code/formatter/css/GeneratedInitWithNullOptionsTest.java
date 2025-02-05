package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class GeneratedInitWithNullOptionsTest {

    @Test
    public void initWithNullOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = null;
        ConfigurationSource cfg = new ConfigurationSource();

        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

}