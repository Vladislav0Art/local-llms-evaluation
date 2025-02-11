package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedDoFormatDoesNotReturnOriginalCodeForLargeChanges {

    @Mock
    private ConfigurationSource cfg;

    public void setConfig(ConfigurationSource config) {
        this.cfg = config;
    }

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void doFormatDoesNotReturnOriginalCodeForLargeChanges() {
        // Given:
        final String originalCode = "body { color: red; }";
        final String modifiedCode = "body { color: blue; background-color: green; }";

        when(formatter.formatter.getCssText(any(CSSStyleSheetImpl.class)))
                .thenReturn(modifiedCode);

        // When:
        final String formattedCode = formatter.doFormat(originalCode, LineEnding.LF);

        // Then:
        assertNotEquals(originalCode, formattedCode);
    }

}