package net.revelc.code.formatter.css;

public class GeneratedTest {

    private CssFormatter cssFormatter;

    @BeforeEach
    void init() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void init_validOptions_shouldCreateFormatter() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        cssFormatter.init(options, null);

        assertNotNull(cssFormatter.getFormatter());
    }

    @Test
    public void doFormat_validCodeAndEnding_shouldFormatCode() throws IOException {
        String code = "h1 {color: red;}";
        String expectedFormattedCode = "h1 {\n    color: red;\n}";
        String formattedCode = cssFormatter.doFormat(code, null);

        assertEquals(expectedFormattedCode, formattedCode);
    }

    @Test
    public void doFormat_sameCode_shouldReturnNull() throws IOException {
        String code = "h1 {\n    color: red;\n}";
        String formattedCode = cssFormatter.doFormat(code, null);

        assertNull(formattedCode);
    }

    @Test
    public void isInitialized_afterInit_shouldReturnTrue() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void isInitialized_withoutInit_shouldReturnFalse() {
        assertFalse(cssFormatter.isInitialized());
    }
}

class AbstractCacheableFormatterTest {
    private AbstractCacheableFormatter abstractCacheableFormatter;

    @BeforeEach
    void init() {
        abstractCacheableFormatter = new AbstractCacheableFormatter();
    }

}