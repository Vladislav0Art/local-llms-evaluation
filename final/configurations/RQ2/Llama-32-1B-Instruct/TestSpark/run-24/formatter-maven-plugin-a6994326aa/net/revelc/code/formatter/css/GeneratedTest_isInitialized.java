package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTest_isInitialized {

    @Test
    public void test_isInitialized() {
        // Arrange
        ConfigurationSource cfg = new ConfigurationSource();

        // Act
        CssFormatter formatter = new CssFormatter();
        boolean initialized = formatter.isInitialized();

        // Assert
        assert initialized;
    }

}