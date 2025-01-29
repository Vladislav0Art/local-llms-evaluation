package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

public class GeneratedTest_init {

    @Test
    public void test_init() {
        // Arrange
        public ConfigurationSource cfg = new ConfigurationSource();

        // Act
        public CssFormatter formatter = new CssFormatter();
        boolean initialized = formatter.init(cfg, null);

        // Assert
        assert initialized;
    }

}