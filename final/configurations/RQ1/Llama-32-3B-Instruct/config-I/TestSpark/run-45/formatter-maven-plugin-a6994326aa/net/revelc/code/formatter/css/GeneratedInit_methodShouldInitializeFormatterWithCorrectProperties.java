package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInit_methodShouldInitializeFormatterWithCorrectProperties {

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
    public void init_methodShouldInitializeFormatterWithCorrectProperties() {
        // Arrange
        String indent = "8";
        boolean rgbAsHex = true;
        boolean useSourceStringValues = false;

        when(options.get("indent")).thenReturn(indent);
        when(options.get("rgbAsHex")).thenReturn(rgbAsHex.toString());
        when(options.get("useSourceStringValues")).thenReturn(useSourceStringValues.toString());

        // Act
        formatter.init(options, cfg);

        // Assert
        assertNotNull(formatter.getFormatter());
        assertEquals(Integer.parseInt(indent), formatter.getFormatter().getIndent());
        assertTrue(formatter.getFormatter().isRgbAsHex());
        assertFalse(formatter.getFormatter().isUseSourceStringValues());
    }

}