package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInitConfig {

    @Test
    public void testInitConfig() {
        final Map<String, String> options = Mockito.mock(Map.class);
        final ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        new CssFormatter().init(options, cfg);
        verify(init).withOptions(options, cfg);
    }

}