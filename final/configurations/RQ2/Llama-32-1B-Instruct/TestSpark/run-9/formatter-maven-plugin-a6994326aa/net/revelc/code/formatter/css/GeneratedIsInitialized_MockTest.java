package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedIsInitialized_MockTest {

    @Test
    public void isInitialized_MockTest() {
        Map<String, String> options = Collections.emptyMap();
        ConfigurationSource cfg = null;
        when(cfg.getOption("format", "css")).thenReturn(options);
        CssFormatter formatter = new CssFormatter(options, cfg);
        assert !formatter.isInitialized() : "isInitialized failed";
    }

}