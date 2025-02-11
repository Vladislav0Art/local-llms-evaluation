package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedDoFormatWithoutCSSCodeReturnsNull {

    @Mock
    private ConfigurationSource cfg;

    public void setConfig(ConfigurationSource config) {
        this.cfg = config;
    }

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void doFormatWithoutCSSCodeReturnsNull() {
        // Given:
        final String code = "";

        // When and Then:
        assertEquals(null, formatter.doFormat(code, LineEnding.LF));
    }

}