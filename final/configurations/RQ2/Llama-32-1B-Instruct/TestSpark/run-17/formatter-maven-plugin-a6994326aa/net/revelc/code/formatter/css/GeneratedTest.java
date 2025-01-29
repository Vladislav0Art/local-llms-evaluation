package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

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