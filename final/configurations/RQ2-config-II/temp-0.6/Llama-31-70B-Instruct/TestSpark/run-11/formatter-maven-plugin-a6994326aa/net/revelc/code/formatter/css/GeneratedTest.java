package net.revelc.code.formatter.css;

public class GeneratedTest {

    private CssFormatter formatter;
    private String code;
    private LineEnding ending = LineEnding.UNIX;
    private Map<String, String> options = new HashMap<String, String>();

    @Before
    public void setup() {
        formatter = new CssFormatter();
        code = "some code to format";
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
    }

    @Test
    public void testInit_ValidOptions() {
        formatter.init(options, null);
        assertNotNull(formatter.getFormatter());
    }

    @Test
    public void testInit_InvalidIndent() {
        options.put("indent", "invalid");
        formatter.init(options, null);
    }

    @Test
    public void testInit_InvalidRgbAsHex() {
        options.put("rgbAsHex", "invalid");
        formatter.init(options, null);
    }

    @Test
    public void testInit_InvalidUseSourceStringValues() {
        options.put("useSourceStringValues", "invalid");
        formatter.init(options, null);
    }

    @Test
    public void testDoFormat_ValidCode() throws IOException {
        String result = formatter.doFormat(code, ending);
        assertNotNull(result);
    }

    @Test
    public void testDoFormat_InvalidCode() throws IOException {
        formatter.doFormat("invalid code", ending);
    }

    @Test
    public void testIsInitialized_Initialized() {
        formatter.init(options, null);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void testIsInitialized_NotInitialized() {
        assertFalse(formatter.isInitialized());
    }

}