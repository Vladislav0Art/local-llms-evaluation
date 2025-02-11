package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedInitWithValidOptionsDoesNotThrowException {

    @Mock
    private ConfigurationSource cfg;

    public void setConfig(ConfigurationSource config) {
        this.cfg = config;
    }

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void initWithValidOptionsDoesNotThrowException() {
        // Given:
        final Map<String, String> options = new java.util.HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", Boolean.TRUE.toString());
        options.put("useSourceStringValues", Boolean.FALSE.toString());

        when(cfg.getOptions()).thenReturn(options);

        formatter.setConfig(cfg);

        // When:
        formatter.init(null, null);

        // Then:
        assertNotNull(formatter.formatter);
    }

}