package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatCssStringNoStyle {

    @Test
    public void testDoFormatCssStringNoStyle() {
        // Arrange
        final InputSource input = new InputSource(new StringReader("body {\n  font-size: 12px;\n}"));
        final LineEnding ending = LineEnding.LF_LEFT;

        // Act
        final CssFormatter formatter = new CssFormatter();
        final String result = formatter.doFormat(input, ending);

        // Assert
        assertEquals("", result);
    }

}