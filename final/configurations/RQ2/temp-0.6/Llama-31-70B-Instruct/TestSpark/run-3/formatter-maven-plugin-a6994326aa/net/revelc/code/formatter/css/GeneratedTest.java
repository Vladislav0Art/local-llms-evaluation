package net.revelc.code.formatter.css;

public class GeneratedTest {

    private CssFormatter cssFormatter;

    @Test
    public void initTest() {
        // Given
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();

        // When
        cssFormatter.init(options, cfg);

        // Then
        assertTrue(cssFormatter.isInitialized());
    }

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