package net.revelc.code.formatter.css;

public class GeneratedIsInitialized_returns_true {

    private static final String INDENT_OPTIONS = "indent=4";
    private static final String RgbAsHexOptions = Boolean.TRUE.toString();
    private static final String UseSourceStringValuesOptions = Boolean.FALSE.toString();

    @Test
    public void isInitialized_returns_true() {
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), cfg);
        assertTrue(formatter.isInitialized());
    }

}