package net.revelc.code.formatter.css;

import net.revelc.code.formatter.ConfigurationSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestInit {

    @Test
    public void testInit() {
        // Arrange
        String[] options = new String[]{"--css-minify", "--css-no-empty"};
        ConfigurationSource cfg = new ConfigurationSource();

        // Act
        CssFormatter formatter = new CssFormatter(options, cfg);

        // Assert
        assertEquals(1, formatter.init().size());
    }

}