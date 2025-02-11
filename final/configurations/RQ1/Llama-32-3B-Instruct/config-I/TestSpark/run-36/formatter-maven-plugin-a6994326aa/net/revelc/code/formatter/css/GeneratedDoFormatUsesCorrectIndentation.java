package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedDoFormatUsesCorrectIndentation {

    @Mock
    private ConfigurationSource cfg;

    public void setConfig(ConfigurationSource config) {
        this.cfg = config;
    }

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void doFormatUsesCorrectIndentation() {
        // Given:
        final String code = "body { color: red; }";
        when(formatter.formatter.getIndent()).thenReturn(4);

        // When:
        final String formattedCode = formatter.doFormat(code, LineEnding.LF);

        // Then:
        assertTrue(formattedCode.startsWith("\t\tbody "));
    }

}