package net.revelc.code.formatter.css;

public class GeneratedInit_withInvalidOptions_test {

    @Test
    public void init_withInvalidOptions_test() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "invalid");
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        when(cfg.getOptionValue(anyString())).thenReturn("");
        assertThrows(FormatterException.class, () -> new CssFormatter().init(options, cfg));
    }

}