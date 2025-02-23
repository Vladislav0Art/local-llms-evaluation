package net.revelc.code.formatter.css;

public class GeneratedDoFormat_invalidInput_returnsNull {

    private CssFormatter cssFormatter;

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

}