package net.revelc.code.formatter.css;

public class GeneratedInit_formatter_with_valid_indent_options {

    private static final String INDENT_OPTIONS = "indent=4";
    private static final String RgbAsHexOptions = Boolean.TRUE.toString();
    private static final String UseSourceStringValuesOptions = Boolean.FALSE.toString();

    @Test
    public void init_formatter_with_valid_indent_options() {
        Map<String, String> options = new HashMap<>();
        options.put(INDENT_OPTIONS, INDENT_OPTIONS);
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        CssFormatter formatter = new CssFormatter();
        (formatter.init(options, cfg));
        assertEquals(Integer.parseInt(INDENT_OPTIONS.split("=")[1]), formatter.getIndent());
    }

}