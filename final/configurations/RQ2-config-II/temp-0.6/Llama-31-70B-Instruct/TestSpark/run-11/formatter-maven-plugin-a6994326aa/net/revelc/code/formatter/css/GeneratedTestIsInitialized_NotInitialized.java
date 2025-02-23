package net.revelc.code.formatter.css;

public class GeneratedTestIsInitialized_NotInitialized {

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
    public void testIsInitialized_NotInitialized() {
        assertFalse(formatter.isInitialized());
    }

}