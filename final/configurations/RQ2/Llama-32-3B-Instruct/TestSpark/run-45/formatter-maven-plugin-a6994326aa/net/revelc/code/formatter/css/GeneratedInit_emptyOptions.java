package net.revelc.code.formatter.css;

public class GeneratedInit_emptyOptions {

    @Mock
    private ConfigurationSource cfg;

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void init_emptyOptions() {
        when(cfg.getOption(anyString())).thenReturn(null);
        when(cfg.isInitialized()).thenReturn(false);
        formatter.init(null, cfg);
        assertTrue(formatter.isInitialized());
    }
}

}