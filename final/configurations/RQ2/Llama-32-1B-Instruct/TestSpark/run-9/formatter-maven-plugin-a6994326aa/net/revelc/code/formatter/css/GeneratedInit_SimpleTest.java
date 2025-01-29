package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedInit_SimpleTest {

    @Test
    public void init_SimpleTest() {
        Map<String, String> options = Collections.emptyMap();
        ConfigurationSource cfg = getConfigurationSource();
        when(cfg.getOption("format", "css")).thenReturn(options);
        CssFormatter formatter = new CssFormatter(options, cfg);
        assert formatter.init(options, cfg) : "init failed";
    }

}