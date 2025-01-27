package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFormatterIsInitialized {

    public static final String LF = "\n";
    public static final String CRLF = "\r\n";
}

public class ConfigurationSource {
    // properties, getters and setters...
}

import org.junit.Test;
import static org.junit.Assert .*;

public class GeneratedTest {

    @Test
    public void testFormatterIsInitialized() throws Exception {
        Map<String, String> options = java.util.Map.of("key", "value");
        ConfigurationSource cfg = new ConfigurationSource();
        // setup formatter with cfg and options
        Formatter formatter = new Formatter(cfg, options);

        assertTrue(formatter.isInitialized());
    }

}