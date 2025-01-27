package net.revelc.code.formatter.css;

public class GeneratedInitNoOptions_test {

    private CssFormatter formatter;

    @Test
    public void initNoOptions_test() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        when(cfg.getOptions()).thenReturn(options);
        formatter.init(options, cfg);
        verify(cfg).setOptions(options);
    }

}