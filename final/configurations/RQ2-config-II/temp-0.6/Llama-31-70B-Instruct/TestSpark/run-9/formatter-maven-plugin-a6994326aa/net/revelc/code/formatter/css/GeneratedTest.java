package net.revelc.code.formatter.css;

public class GeneratedTest {

    private CssFormatter cssFormatter;

    @Test
    public void doFormat_validInput_returnsFormattedCode() throws IOException {
        // Arrange
        String code = "body { background-color: #0000FF; }";
        String expectedFormattedCode = "body {\n    background-color: #0000FF;\n}";
        cssFormatter = new CssFormatter();
        cssFormatter.init(Map.of("indent", "4", "rgbAsHex", "true"), null);

        // Act
        String formattedCode = cssFormatter.doFormat(code, LineEnding.UNIX);

        // Assert
        assertEquals(expectedFormattedCode, formattedCode);
    }

    @Test
    public void doFormat_invalidInput_returnsNull() throws IOException {
        // Arrange
        String code = "body { background-color: #0000FF; }";
        cssFormatter = new CssFormatter();

        // Act
        String formattedCode = cssFormatter.doFormat(code, LineEnding.UNIX);

        // Assert
        assertNull(formattedCode);
    }

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