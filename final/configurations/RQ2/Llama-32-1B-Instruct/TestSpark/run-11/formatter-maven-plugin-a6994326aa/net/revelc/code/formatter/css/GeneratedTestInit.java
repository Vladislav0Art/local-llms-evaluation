package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestInit {

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

}