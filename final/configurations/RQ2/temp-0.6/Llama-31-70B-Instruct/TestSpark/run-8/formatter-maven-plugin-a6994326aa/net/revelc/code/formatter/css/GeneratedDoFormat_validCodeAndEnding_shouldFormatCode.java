package net.revelc.code.formatter.css;

public class GeneratedDoFormat_validCodeAndEnding_shouldFormatCode {

    private CssFormatter cssFormatter;

    @BeforeEach
    void init() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void doFormat_validCodeAndEnding_shouldFormatCode() throws IOException {
        String code = "h1 {color: red;}";
        String expectedFormattedCode = "h1 {\n    color: red;\n}";
        String formattedCode = cssFormatter.doFormat(code, null);

        assertEquals(expectedFormattedCode, formattedCode);
    }

}