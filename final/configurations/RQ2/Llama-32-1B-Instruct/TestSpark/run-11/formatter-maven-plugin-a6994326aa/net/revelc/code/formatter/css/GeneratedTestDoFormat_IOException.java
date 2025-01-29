package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDoFormat_IOException {

    @Test
    public void testDoFormat_IOException() throws IOException {
        // Arrange
        Map<String, String> options = Collections.singletonMap("parserErrorSupport", "true");
        ConfigurationSource cfg = new FileConfigurationSource("path/to/css/file.css");
        CssFormatter formatter = new CssFormatter(options, cfg);

        // Act and Assert
        formatter.doFormat(cssFile[0], cssFile[1]);
    }

}