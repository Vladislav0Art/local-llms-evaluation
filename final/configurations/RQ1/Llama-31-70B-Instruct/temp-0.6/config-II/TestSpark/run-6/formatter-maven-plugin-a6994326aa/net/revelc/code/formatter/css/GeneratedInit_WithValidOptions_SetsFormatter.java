package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;

public class GeneratedInit_WithValidOptions_SetsFormatter {

    @Test
    public void init_WithValidOptions_SetsFormatter() {
        // Arrange
        final Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        final ConfigurationSource cfg = new ConfigurationSource();
        final CssFormatter formatter = new CssFormatter();

        // Act
        formatter.init(options, cfg);

        // Assert
        assertNotNull(formatter.formatter);
        assertEquals(4, formatter.formatter.getIndent());
        assertEquals(true, formatter.formatter.isRgbAsHex());
        assertEquals(false, formatter.formatter.isUseSourceStringValues());
    }

}