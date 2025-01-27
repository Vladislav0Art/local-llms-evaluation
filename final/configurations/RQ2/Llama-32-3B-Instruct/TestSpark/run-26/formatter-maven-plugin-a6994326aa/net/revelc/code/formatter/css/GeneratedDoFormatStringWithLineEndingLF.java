package net.revelc.code.formatter.css;

public class GeneratedDoFormatStringWithLineEndingLF {

    @Test
    public void doFormatStringWithLineEndingLF() throws IOException {
        // Arrange
        String input = "test\n";
        CssFormatter formatter = new CssFormatter();

        // Act
        Object result = formatter.doFormatString(input);

        // Assert
        assert result instanceof String;
    }

}