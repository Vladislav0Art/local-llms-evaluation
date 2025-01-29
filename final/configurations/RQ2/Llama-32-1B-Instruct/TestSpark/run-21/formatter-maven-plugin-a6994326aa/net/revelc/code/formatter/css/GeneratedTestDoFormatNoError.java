package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatNoError {

    @Test
    public void testDoFormatNoError() throws IOException {
        // Arrange
        final String code = "body { color: red; }";
        final LineEnding ending = LineEnding.CRLF;

        // Act
        String result = formatter.doFormat(code, ending);

        // Assert
        assert Not(result.isEmpty());
    }

}