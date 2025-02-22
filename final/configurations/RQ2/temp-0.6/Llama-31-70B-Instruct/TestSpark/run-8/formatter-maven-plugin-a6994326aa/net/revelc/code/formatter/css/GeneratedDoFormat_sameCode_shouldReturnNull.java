package net.revelc.code.formatter.css;

public class GeneratedDoFormat_sameCode_shouldReturnNull {

    private CssFormatter cssFormatter;

    @BeforeEach
    void init() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void doFormat_sameCode_shouldReturnNull() throws IOException {
        String code = "h1 {\n    color: red;\n}";
        String formattedCode = cssFormatter.doFormat(code, null);

        assertNull(formattedCode);
    }

}