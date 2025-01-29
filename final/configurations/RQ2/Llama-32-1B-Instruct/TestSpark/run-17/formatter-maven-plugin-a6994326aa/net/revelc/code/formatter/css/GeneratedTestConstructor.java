package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestConstructor {

    @Test
    public void testConstructor() {
        // Arrange
        String[] options = {"--css", "--source-map"};
        String input = "body { color: blue; }";

        // Act
        CssFormatter formatter = new CssFormatter(options);

        // Assert
        CSSFormat cssFormat = formatter.doFormat(null);
        assertEquals("css", cssFormat.getPrefix());
    }

}