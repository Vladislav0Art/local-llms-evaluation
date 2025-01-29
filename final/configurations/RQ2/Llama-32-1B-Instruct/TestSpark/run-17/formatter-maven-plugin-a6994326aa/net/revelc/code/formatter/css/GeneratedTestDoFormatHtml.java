package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestDoFormatHtml {

    @Test
    public void testDoFormatHtml() {
        // Arrange
        String[] options = {"--css", "--source-map"};
        String input = "<html><body>{color: blue;}</body></html>";

        // Act
        CSSFormat cssFormat = new CssFormatter(options);
        Map<String, String> map = cssFormat.getCssMap();

        // Assert
        assertEquals("css", map.get("prefix"));
    }

}