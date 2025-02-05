package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.junit.Test;

public class GeneratedInitNoOptionsTest {

    @Test
    public void initNoOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        ConfigurrationSource cfg = new ConfigurrationSource();
        Map<String, String> options = new HashMap<>();

        formatter.init(options, cfg);

        assertFalse(formatter.isInitialized());
    }

}