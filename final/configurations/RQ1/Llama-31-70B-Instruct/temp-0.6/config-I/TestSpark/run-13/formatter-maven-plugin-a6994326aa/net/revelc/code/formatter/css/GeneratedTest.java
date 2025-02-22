package net.revelc.code.formatter.css;

public class GeneratedTest {

    private CssFormatter cssFormatter;

    @Before
    public void setup() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void initWithOptionsTest() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        cssFormatter.init(options, null);

        assertEquals(4, cssFormatter.formatter.getIndent());
        assertEquals(true, cssFormatter.formatter.isRgbAsHex());
        assertEquals(false, cssFormatter.formatter.isUseSourceStringValues());
    }

    @Test
    public void initWithDefaultsTest() {
        cssFormatter.init(new HashMap<>(), null);

        assertEquals(4, cssFormatter.formatter.getIndent());
        assertEquals(true, cssFormatter.formatter.isRgbAsHex());
        assertEquals(false, cssFormatter.formatter.isUseSourceStringValues());
    }

    @Test
    public void doFormatTest() throws IOException {
        String code = "h1 { color: red; }";
        String expected = "h1 {\n    color: red;\n}";
        String ending = "\n";
        cssFormatter.init(new HashMap<>(), null);

        String result = cssFormatter.doFormat(code, ending);

        assertEquals(expected, result);
    }

    @Test
    public void doFormatSameCodeTest() throws IOException {
        String code = "h1 {\n    color: red;\n}";
        String ending = "\n";
        cssFormatter.init(new HashMap<>(), null);

        String result = cssFormatter.doFormat(code, ending);

        assertNull(result);
    }

    @Test
    public void isInitializedTest() {
        assertTrue(cssFormatter.isInitialized());
    }

}