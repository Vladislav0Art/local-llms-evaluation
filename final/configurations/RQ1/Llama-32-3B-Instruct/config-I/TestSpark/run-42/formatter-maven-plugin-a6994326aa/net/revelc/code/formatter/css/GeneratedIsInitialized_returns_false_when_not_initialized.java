package net.revelc.code.formatter.css;

public class GeneratedIsInitialized_returns_false_when_not_initialized {

    private static final String INDENT_OPTIONS = "indent=4";
    private static final String RgbAsHexOptions = Boolean.TRUE.toString();
    private static final String UseSourceStringValuesOptions = Boolean.FALSE.toString();

    @Test
    public void isInitialized_returns_false_when_not_initialized() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

}