package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatEmptyStylesheet {

    @Test
    public void testDoFormatEmptyStylesheet() throws IOException {
        // Arrange
        final String code = "body { color: red; }";
        final LineEnding ending = LineEnding.ET;

        // Act
        try {
            formatter.doFormat(code, ending);
            fail("Expected IOException");
        } catch (IOException e) {
        }

        // Assert
        assert Not(result.isEmpty());
    }

}