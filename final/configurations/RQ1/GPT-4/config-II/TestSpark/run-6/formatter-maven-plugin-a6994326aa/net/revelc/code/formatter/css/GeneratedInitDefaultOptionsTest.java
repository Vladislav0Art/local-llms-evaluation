package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedInitDefaultOptionsTest {

    @Test
    public void initDefaultOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        assertTrue(formatter.isInitialized());
    }

}