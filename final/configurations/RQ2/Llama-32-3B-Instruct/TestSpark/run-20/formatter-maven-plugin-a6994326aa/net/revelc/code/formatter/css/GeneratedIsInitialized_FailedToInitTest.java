package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;

public class GeneratedIsInitialized_FailedToInitTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void isInitialized_FailedToInitTest() throws IOException {
        Map<String, String> options = Map.of();
        ConfigurationSource cfg = new ConfigurationSource();
        formatter.init(options, null);
        assertFalse(formatter.isInitialized());
    }

}