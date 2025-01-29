package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatCssStringWithStyleAndLineEndingAndOptions {

    @Test
    public void testDoFormatCssStringWithStyleAndLineEndingAndOptions() {
        // Arrange
        final InputSource input = new InputSource(new StringReader("body {\n  font-size: 12px;\n}"));
        final CssFormatter formatter = new CssFormatter();
        final Map<String, String> options = new HashMap<>();
        options.put("format", "css");
        final ConfigurationSource cfg = new ConfigurationSource();

        // Act
        final String result = formatter.doFormat(input, ending);

        // Assert
        assertEquals(code + "\n", result);
    }

}