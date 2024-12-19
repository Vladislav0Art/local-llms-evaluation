package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCssFormatter_isInitialized {

    @Test
    public void cssFormatter_isInitialized() {
        // Act
        boolean isInitialized = CssFormatter.isInitialized();

        // Assert
        assert !isInitialized;
    }

}