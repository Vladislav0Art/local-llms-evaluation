package net.revelc.code.formatter.css;

public class GeneratedIsInitialized_afterInit_shouldReturnTrue {

    private CssFormatter cssFormatter;

    @BeforeEach
    void init() {
        cssFormatter = new CssFormatter();
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

}