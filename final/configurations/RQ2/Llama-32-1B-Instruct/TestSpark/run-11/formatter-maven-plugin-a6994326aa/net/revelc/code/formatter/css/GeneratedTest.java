package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testInit() throws IOException, LineEndingException {
        // Arrange
        Map<String, String> options = Collections.singletonMap("parserErrorSupport", "true");
        ConfigurationSource cfg = new FileConfigurationSource("path/to/css/file.css");
        CssFormatter formatter = new CssFormatter(options, cfg);

        // Act
        boolean initialized = formatter.isInitialized();

        // Assert
        assertTrue(initialized);
    }

    @Test
    public void testDoFormat() throws IOException {
        // Arrange
        Map<String, String> options = Collections.singletonMap("parserErrorSupport", "true");
        ConfigurationSource cfg = new FileConfigurationSource("path/to/css/file.css");
        CssFormatter formatter = new CssFormatter(options, cfg);

        // Act
        String formattedCss = formatter.doFormat(cssFile[0], cssFile[1]);

        // Assert
        assertNotNull(formattedCss);
    }

    @Test
    public void testIsInitialized() throws IOException {
        // Arrange
        Map<String, String> options = Collections.singletonMap("parserErrorSupport", "true");
        ConfigurationSource cfg = new FileConfigurationSource("path/to/css/file.css");

        // Act and Assert
        assertTrue(CssFormatter.class.isInstance(formatter));
    }

    @Test
    public void testDoFormat_IOException() throws IOException {
        // Arrange
        Map<String, String> options = Collections.singletonMap("parserErrorSupport", "true");
        ConfigurationSource cfg = new FileConfigurationSource("path/to/css/file.css");
        CssFormatter formatter = new CssFormatter(options, cfg);

        // Act and Assert
        formatter.doFormat(cssFile[0], cssFile[1]);
    }

    @Test
    public void testDoFormat_LineEndingException() throws IOException {
        // Arrange
        Map<String, String> options = Collections.singletonMap("parserErrorSupport", "true");
        ConfigurationSource cfg = new FileConfigurationSource("path/to/css/file.css");
        CssFormatter formatter = new CssFormatter(options, cfg);

        // Act and Assert
        formatter.doFormat(cssFile[0], cssFile[1]);
    }

    @Test
    public void testCssFormat() throws IOException {
        // Arrange
        Map<String, String> options = Collections.singletonMap("parserErrorSupport", "true");
        ConfigurationSource cfg = new FileConfigurationSource("path/to/css/file.css");
        CssFormatter formatter = new CssFormatter(options, cfg);

        // Act
        String formattedCss = formatter.doFormat(cssFile[0], cssFile[1]);

        // Assert
        assertNotNull(formattedCss);
    }

    @Test
    public void testInvalidOption() throws IOException {
        // Arrange
        Map<String, String> options = Collections.singletonMap("parserErrorSupport", "true");

        // Act and Assert
        assertFalse(CssFormatter.class.isInstance(formatter));
    }

}