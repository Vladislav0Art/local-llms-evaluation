package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedInitWithNullConfigurationSourceTest {

    private CssFormatter formatter;

    @Test
    public void initWithNullConfigurationSourceTest() {
        Map<String, String> options = new HashMap<>();
        formatter = new CssFormatter();
        formatter.init(options, null);
        assertTrue(formatter.isInitialized());
    }

}