package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatWithoutChanges {

    private CssFormatter cssFormatter;

    @Test
    public void testDoFormatWithoutChanges() throws IOException {
        // Given
        String code = "body {\n    color: #000;\n}\n";
        LineEnding ending = LineEnding.UNIX;

        // When
        String formattedCode = cssFormatter.doFormat(code, ending);

        // Then
        assertNull(formattedCode);
    }

}