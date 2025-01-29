package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestIsInitialized {

    @Test
    public void testIsInitialized() throws IOException {
        // Arrange
        Map<String, String> options = Collections.singletonMap("parserErrorSupport", "true");
        ConfigurationSource cfg = new FileConfigurationSource("path/to/css/file.css");

        // Act and Assert
        assertTrue(CssFormatter.class.isInstance(formatter));
    }

}