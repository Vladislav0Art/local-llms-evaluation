package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;

public class GeneratedInitTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void initTest() {
        Map<String, String> options = Map.of();
        ConfigurationSource cfg = new ConfigurationSource();
        try {
            formatter.init(options, cfg);
            assertTrue(formatter.isInitialized());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

}