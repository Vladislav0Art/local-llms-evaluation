package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedInitWithNullOptionsTest {

    private CssFormatter formatter;

    @Test
    public void initWithNullOptionsTest() {
        ConfigurationSource cfg = new ConfigurationSource();
        formatter = new CssFormatter();
        formatter.init(null, cfg);
        assertTrue(formatter.isInitialized());
    }

}