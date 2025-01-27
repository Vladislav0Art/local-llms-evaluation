package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedInit[]

Test {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void init[] Test() {
        Map<String, String> options = Map.of();
        ConfigurationSource cfg = new ConfigurationSource();
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

}