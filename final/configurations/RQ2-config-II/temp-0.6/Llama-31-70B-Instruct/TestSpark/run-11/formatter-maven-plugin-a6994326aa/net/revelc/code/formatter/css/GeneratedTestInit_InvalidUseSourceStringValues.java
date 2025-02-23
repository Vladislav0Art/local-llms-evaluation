package net.revelc.code.formatter.css;

public class GeneratedTestInit_InvalidUseSourceStringValues {

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
    public void testInit_InvalidUseSourceStringValues() {
        options.put("useSourceStringValues", "invalid");
        formatter.init(options, null);
    }

}