package net.revelc.code.formatter.css;

public class GeneratedInit_formatter_without_valid_indent_options {

    private static final String INDENT_OPTIONS = "indent=4";
    private static final String RgbAsHexOptions = Boolean.TRUE.toString();
    private static final String UseSourceStringValuesOptions = Boolean.FALSE.toString();

    @Test
    public void init_formatter_without_valid_indent_options() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
        assertEquals(4, formatter.getIndent());
    }

}