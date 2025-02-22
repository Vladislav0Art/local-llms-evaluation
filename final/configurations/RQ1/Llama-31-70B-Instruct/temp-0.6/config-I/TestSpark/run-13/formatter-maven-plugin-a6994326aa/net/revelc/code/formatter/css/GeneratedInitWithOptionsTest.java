package net.revelc.code.formatter.css;

public class GeneratedInitWithOptionsTest {

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

}