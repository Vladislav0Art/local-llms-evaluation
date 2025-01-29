package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestConstructorNullOptions {

    @Test
    public void testConstructorNullOptions() {
        // Arrange
        String[] options = null;
        String input = "body { color: blue; }";

        // Act
        CssFormatter formatter = new CssFormatter(options);

        // Assert
        CSSFormat cssFormat = formatter.doFormat(null);
        assertEquals("css", cssFormat.getPrefix());
    }

}