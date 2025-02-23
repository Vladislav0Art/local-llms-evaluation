package net.revelc.code.formatter.css;

public class GeneratedIsInitialized_validFormatter_returnsTrue {

    private CssFormatter cssFormatter;

    @Test
    public void isInitialized_validFormatter_returnsTrue() {
        // Arrange
        cssFormatter = new CssFormatter();
        cssFormatter.init(Map.of("indent", "4", "rgbAsHex", "true"), null);

        // Act
        boolean isInitialized = cssFormatter.isInitialized();

        // Assert
        assertTrue(isInitialized);
    }

}