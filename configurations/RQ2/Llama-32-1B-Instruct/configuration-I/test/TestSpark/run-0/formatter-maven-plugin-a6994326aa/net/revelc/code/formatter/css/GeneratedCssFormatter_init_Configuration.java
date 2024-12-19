package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCssFormatter_init_Configuration {

    @Test
    public void cssFormatter_init_Configuration() {
        // Arrange
        String options = "{";
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        AbstractCacheableFormatter formatter = new CssFormatter();

        // Act
        formatter.init(options, cfg);

        // Assert
        Mockito.verify(formatter).init(Mockito.anyMap(), Mockito.any(ConfigurationSource.class));
    }

}