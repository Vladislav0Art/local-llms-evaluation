package net.revelc.code.formatter.css;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestInit_invalidOptions {

    @Mock
    private Map<String, String> options;

    @Mock
    private ConfigurationSource cfg;

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void testInit_invalidOptions() {
        // Arrange
        when(options.getOrDefault("indent", "4")).thenReturn("-1");
        when(options.getOrDefault("rgbAsHex", Boolean.TRUE.toString())).thenReturn(Boolean.TRUE.toString());
        when(options.getOrDefault("useSourceStringValues", Boolean.FALSE.toString())).thenReturn(Boolean.FALSE.toString());
        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> formatter.init(options, cfg));
    }

}