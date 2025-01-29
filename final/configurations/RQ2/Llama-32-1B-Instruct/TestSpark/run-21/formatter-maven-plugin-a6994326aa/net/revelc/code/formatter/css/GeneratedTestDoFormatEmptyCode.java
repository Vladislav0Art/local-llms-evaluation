package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatEmptyCode {

    @Test
    public void testDoFormatEmptyCode() throws IOException {
        // Arrange
        final String code = "";

        // Act
        String result = formatter.doFormat(code, LineEnding.ET);

        // Assert
        assert Not(result.isEmpty());
    }

}