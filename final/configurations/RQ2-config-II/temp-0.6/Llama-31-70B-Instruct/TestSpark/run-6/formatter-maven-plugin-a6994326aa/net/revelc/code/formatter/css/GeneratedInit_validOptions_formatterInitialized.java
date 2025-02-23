package net.revelc.code.formatter.css;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInit_validOptions_formatterInitialized {

    @Mock
    private Map<String, String> options;

    @Mock
    private ConfigurationSource cfg;

    @InjectMocks
    private CssFormatter cssFormatter;

    @Test
    public void init_validOptions_formatterInitialized() {
        when(options.get("indent")).thenReturn("4");
        when(options.get("rgbAsHex")).thenReturn("true");
        when(options.get("useSourceStringValues")).thenReturn("false");

        cssFormatter.init(options, cfg);

        assertThat(cssFormatter.isInitialized()).isTrue();
    }

}