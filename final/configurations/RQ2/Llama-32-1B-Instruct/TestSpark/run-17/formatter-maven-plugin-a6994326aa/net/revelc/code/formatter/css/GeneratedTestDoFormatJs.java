package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestDoFormatJs {

    @Test
    public void testDoFormatJs() {
        // Arrange
        String[] options = {"--css", "--source-map"};
        String input = "<script>{color: blue;}</script>";

        // Act
        CSSFormat cssFormat = new CssFormatter(options);
        Map<String, String> map = cssFormat.getCssMap();

        // Assert
        assertEquals("css", map.get("prefix"));
    }

}