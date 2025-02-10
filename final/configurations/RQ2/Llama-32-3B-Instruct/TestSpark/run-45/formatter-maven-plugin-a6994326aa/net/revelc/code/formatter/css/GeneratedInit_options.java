package net.revelc.code.formatter.css;

public class GeneratedInit_options {

    @Mock
    private ConfigurationSource cfg;

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void init_options() {
        when(cfg.getOption(anyString())).thenReturn("optionValue");
        when(cfg.isInitialized()).thenReturn(true);
        formatter.init(null, cfg);
        assertFalse(formatter.isInitialized());
    }

}