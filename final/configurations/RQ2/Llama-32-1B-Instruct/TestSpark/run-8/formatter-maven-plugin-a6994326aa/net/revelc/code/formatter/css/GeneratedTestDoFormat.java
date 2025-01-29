package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat {

    @Test
    public void testDoFormat() throws IOException {
        // Arrange
        final InputSource source = new InputSource(new StringReader("body {\n  background-color: #ffffff;\n}"));
        final CsStyleFormatter formatter = new CsStyleFormatter();

        // Act
        final StringBuilder expectedCssCode = new StringBuilder();
        for (String line : formatter.doFormat(source)) {
            if (!expectedCssCode.toString().isEmpty()) {
                expectedCssCode.append("\n");
            }
            expectedCssCode.append(line);
        }

        // Assert
        Assertions.assertEquals(expectedCssCode.toString(), source.getCharacterStream());
    }

}