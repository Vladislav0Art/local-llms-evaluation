package net.revelc.code.formatter.css;

public class GeneratedDoFormatTest {

    private CssFormatter cssFormatter;

    @Test
    public void doFormatTest() throws IOException {
        // Given
        String code = "body { background-color: red; }";
        LineEnding ending = LineEnding.UNIX;

        // When
        String formattedCode = cssFormatter.doFormat(code, ending);

        // Then
        assertEquals("body {\n    background-color: red;\n}\n", formattedCode);
    }

}