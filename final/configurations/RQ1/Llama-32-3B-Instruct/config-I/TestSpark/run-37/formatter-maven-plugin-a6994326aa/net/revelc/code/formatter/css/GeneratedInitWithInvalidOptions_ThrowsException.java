package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

public class GeneratedInitWithInvalidOptions_ThrowsException {

    @Test
    public void initWithInvalidOptions_ThrowsException() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "abc");
        ConfigurationSource cfg = null;
        try {
            new CssFormatter().init(options, cfg);
            fail("Expected exception not thrown");
        } catch (Exception e) {
        }
    }

}