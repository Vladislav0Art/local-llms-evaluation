package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestInit {

    @Test
    public void testInit() {
        when(ConfigurationSource::create ()).thenReturn(new MockConfigurationSource());
        Map<String, String> options = new HashMap<>();
        CssFormatter instance = new CssFormatter(options, ConfigurationSource.class);
        assertInstanceInitialized(instance);
    }

}