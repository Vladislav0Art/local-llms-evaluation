package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.ConfigurationSource;

public class GeneratedTest {

    @Test
    public void testInit() {
        // Arrange
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");

        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);

        CssFormatter formatter = new CssFormatter();

        // Act
        formatter.init(options, cfg);

        // Assert
        assertNotNull(formatter.formatter);
        assertEquals(4, formatter.formatter.getPropertiesInSeparateLines());
        assertTrue(formatter.formatter.isRgbAsHex());
        assertFalse(formatter.formatter.isUseSourceStringValues());
    }

}