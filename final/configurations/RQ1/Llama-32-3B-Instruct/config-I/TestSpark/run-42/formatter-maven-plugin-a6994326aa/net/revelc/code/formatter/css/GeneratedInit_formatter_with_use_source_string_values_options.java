package net.revelc.code.formatter.css;

public class GeneratedInit_formatter_with_use_source_string_values_options {

    private static final String INDENT_OPTIONS = "indent=4";
    private static final String RgbAsHexOptions = Boolean.TRUE.toString();
    private static final String UseSourceStringValuesOptions = Boolean.FALSE.toString();

    @Test
    public void init_formatter_with_use_source_string_values_options() {
        Map<String, String> options = new HashMap<>();
        options.put("useSourceStringValues", UseSourceStringValuesOptions);
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
        assertTrue(formatter.isUseSourceStringValues());
    }

}