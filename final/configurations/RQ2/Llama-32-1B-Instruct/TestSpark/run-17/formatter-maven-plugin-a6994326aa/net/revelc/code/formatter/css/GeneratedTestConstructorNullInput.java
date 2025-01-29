package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestConstructorNullInput {

    @Test
    public void testConstructorNullInput() {
        // Arrange
        String[] options = {"--css", "--source-map"};
        null = input;

        // Act
        CssFormatter formatter = new CssFormatter(options);

        // Assert
        CSSFormat cssFormat = formatter.doFormat(null);
        assertEquals("css", cssFormat.getPrefix());
    }

}