package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatCssStringNoLineEnding {

    @Test
    public void testDoFormatCssStringNoLineEnding() {
        // Arrange
        final InputSource input = new InputSource(new StringReader("body {\n  font-size: 12px;\n}"));
        final CssFormatter formatter = new CssFormatter();
        final LineEnding ending = null;

        // Act
        final String result = formatter.doFormat(input, ending);

        // Assert
        assertEquals("", result);
    }

}