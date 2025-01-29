package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestDoFormatCssFile {

    @Test
    public void testDoFormatCssFile() {
        // Arrange
        String[] options = {"--css", "--source-map"};
        String input = "body { color: blue; }";
        File sourceMapFile = new File("output.css.map");

        // Act
        CSSFormat cssFormat = new CssFormatter(options);
        Map<String, String> map = cssFormat.getCssMap();

        // Assert
        assertEquals("css", map.get("prefix"));
    }

}