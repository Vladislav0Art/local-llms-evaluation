package net.revelc.code.formatter.css;

public class GeneratedInit_withValidOptions_test {

    @Test
    public void init_withValidOptions_test() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "  ");
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        when(cfg.getOptionValue(anyString())).thenReturn("");
        new CssFormatter().init(options, cfg);
    }

}