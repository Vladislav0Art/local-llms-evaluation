package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

public class GeneratedInitWithEmptyOptions_ThrowsException {

    @Test
    public void initWithEmptyOptions_ThrowsException() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = null;
        try {
            new CssFormatter().init(options, cfg);
            fail("Expected exception not thrown");
        } catch (Exception e) {
        }
    }

}