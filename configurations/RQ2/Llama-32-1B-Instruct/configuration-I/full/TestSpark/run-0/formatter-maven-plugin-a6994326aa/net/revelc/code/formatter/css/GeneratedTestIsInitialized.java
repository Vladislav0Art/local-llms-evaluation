package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestIsInitialized {

    @Test
    public void testIsInitialized() {
        final Map<String, String> options = Mockito.mock(Map.class);
        Mockito.when(isInitialized()).thenReturn(true);
        new CssFormatter().init(options, Mockito.mock(ConfigurationSource.class));
        verify(isInitialized).withOptions(options, Mockito.any(ConfigurationSource.class));
    }

}