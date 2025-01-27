package net.revelc.code.formatter.css;

public class GeneratedDoFormatStringWithLineEndingCRLF {

    @Test
    public void doFormatStringWithLineEndingCRLF() throws IOException {
        // Arrange
        String input = "test\r\n";
        CssFormatter formatter = new CssFormatter();

        // Act
        Object result = formatter.doFormatString(input);

        // Assert
        assert result instanceof String;
    }

}