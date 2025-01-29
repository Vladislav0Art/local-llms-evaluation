package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatCssStringLineEnd {

    @Test
    public void testDoFormatCssStringLineEnd() {
        // Arrange
        final InputSource input = new InputSource(new StringReader("body {\n  font-size: 12px;\n}"));
        final CssFormatter formatter = new CssFormatter();
        final LineEnding ending = LineEnding.LF_RIGHT;

        // Act
        final String result = formatter.doFormat(input, ending);

        // Assert
        assertEquals("", result);
    }

}