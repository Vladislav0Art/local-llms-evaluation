package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInit_methodShouldThrowIOExceptionWhenFailedToParseOptions {

    @Mock
    private ConfigurationSource cfg;

    @Mock
    private Map<String, String> options;

    private CssFormatter formatter;

    @Before
    public void setup() {
        when(cfg.getOptions()).thenReturn(options);
        formatter = new CssFormatter();
    }

    @After
    public void tearDown() {
        Mockito.reset(cfg, options);
    }

    @Test
    public void init_methodShouldThrowIOExceptionWhenFailedToParseOptions() {
        // Arrange
        when(options.get("indent")).thenReturn(null);
        when(options.get("rgbAsHex")).thenReturn("a");
        when(options.get("useSourceStringValues")).thenReturn("b");

        // Act and Assert
        assertThrows(IOException.class, () -> formatter.init(options, cfg));
    }

}