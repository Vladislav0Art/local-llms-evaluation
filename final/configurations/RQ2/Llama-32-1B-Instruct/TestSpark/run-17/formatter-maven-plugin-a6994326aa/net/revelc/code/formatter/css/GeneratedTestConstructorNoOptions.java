package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestConstructorNoOptions {

    @Test
    public void testConstructorNoOptions() {
        // Arrange
        String[] options = {};

        // Act
        CssFormatter formatter = new CssFormatter(options);

        // Assert
        CSSFormat cssFormat = formatter.doFormat(null);
        assertEquals("css", cssFormat.getPrefix());
    }

}