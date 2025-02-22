package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat {

    private CssFormatter cssFormatter;

    @Test
    public void testDoFormat() throws IOException {
        // Given
        String code = "body { color: #000; }";
        LineEnding ending = LineEnding.UNIX;

        // When
        String formattedCode = cssFormatter.doFormat(code, ending);

        // Then
        assertEquals("body {\n    color: #000;\n}\n", formattedCode);
    }

}