package net.revelc.code.formatter.css;

public class GeneratedInitWithOptions_test {

    private CssFormatter formatter;

    @Test
    public void initWithOptions_test() {
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        when(cfg.getOptions()).thenReturn(options);
        formatter.init(options, cfg);
        verify(cfg).setOptions(options);
    }

}