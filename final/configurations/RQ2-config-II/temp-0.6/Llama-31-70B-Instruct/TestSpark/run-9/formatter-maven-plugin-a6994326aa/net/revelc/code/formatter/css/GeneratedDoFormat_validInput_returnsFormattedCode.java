package net.revelc.code.formatter.css;

public class GeneratedDoFormat_validInput_returnsFormattedCode {

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

}