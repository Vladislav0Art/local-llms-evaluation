package net.revelc.code.formatter.css;

public class GeneratedTestFormatCss {

    @Test
    public void testFormatCss() throws IOException {
        // Arrange
        final InputSource source = new InputSource(new StringReader("body { background-color: #ffffff; }"));
        final String expectedCssCode = "body {\n  background-color: #ffffff;\n}";

        // Act
        final CsStyleFormatter formatter = new CsStyleFormatter();

        // Assert
        Assertions.assertEquals(expectedCssCode, formatter.doFormat(source));
    }

}