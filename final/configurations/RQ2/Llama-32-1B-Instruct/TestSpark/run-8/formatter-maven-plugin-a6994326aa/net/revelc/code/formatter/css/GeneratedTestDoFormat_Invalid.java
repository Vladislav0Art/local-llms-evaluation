package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat_Invalid {

    @Test
    public void testDoFormat_Invalid() throws IOException {
        // Arrange
        final InputSource source = new InputSource(new StringReader("body {\n  background-color: #ffffff;\n}"));
        final CsStyleFormatter formatter = new CsStyleFormatter();

        // Act
        final Exception exception = Assertions.assertThrows(Exception.class, () -> formatter.doFormat(source));

        // Assert
        Assertions.assertFalse(exception.getMessage().contains("Invalid CSS code"));
    }

}