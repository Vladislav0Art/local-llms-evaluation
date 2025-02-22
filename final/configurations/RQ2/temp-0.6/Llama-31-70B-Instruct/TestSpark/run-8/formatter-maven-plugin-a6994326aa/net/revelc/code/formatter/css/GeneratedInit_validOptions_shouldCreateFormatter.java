package net.revelc.code.formatter.css;

public class GeneratedInit_validOptions_shouldCreateFormatter {

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

}