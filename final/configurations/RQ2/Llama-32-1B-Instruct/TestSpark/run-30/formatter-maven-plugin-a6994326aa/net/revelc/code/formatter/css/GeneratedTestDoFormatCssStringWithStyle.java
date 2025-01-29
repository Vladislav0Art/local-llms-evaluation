package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatCssStringWithStyle {

    @Test
    public void testDoFormatCssStringWithStyle() {
        // Arrange
        final InputSource input = new InputSource(new StringReader("body {\n  font-size: 12px;\n}"));
        final CssFormatter formatter = new CssFormatter();
        final String code = "body {\n  font-size: 12px;\n}";
        final LineEnding ending = LineEnding.LF_LEFT;

        // Act
        final String result = formatter.doFormat(input, ending);

        // Assert
        assertEquals(code + "\n", result);
    }

}