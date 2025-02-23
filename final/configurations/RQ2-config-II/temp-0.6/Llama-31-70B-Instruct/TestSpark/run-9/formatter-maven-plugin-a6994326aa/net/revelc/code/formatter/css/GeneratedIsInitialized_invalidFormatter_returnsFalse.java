package net.revelc.code.formatter.css;

public class GeneratedIsInitialized_invalidFormatter_returnsFalse {

    private CssFormatter cssFormatter;

    @Test
    public void isInitialized_invalidFormatter_returnsFalse() {
        // Arrange
        cssFormatter = new CssFormatter();

        // Act
        boolean isInitialized = cssFormatter.isInitialized();

        // Assert
        assertFalse(isInitialized);
    }

}