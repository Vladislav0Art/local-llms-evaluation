package net.revelc.code.formatter.css;

public class GeneratedInit_ValidOptions_CacheIsInitialized {

    public static class ConfigurationSource {
        // implementation
    }

    public interface Options {
        String OPTIONS_CACHE = "cache";
        String OPTIONS_DEBUG = "debug";
    }

    public static class LineEnding {
        public static final String LF = "LF";
        public static final String CRLF = "CRLF";
    }

    @BeforeClass
    public static void setup() {
        // Initialize mock objects here
    }

    @Mock
    private ConfigurationSource cfg;

    @Mock
    private Options options;

    @Test
    public void init_ValidOptions_CacheIsInitialized() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Mockito.when(cfg.getCacheDirectory()).thenReturn("path/to/cache");
        Mockito.when(options.get(CssFormatter.Options.OPTIONS_CACHE)).thenReturn(true);
        Mockito.when(options.get(CssFormatter.Options.OPTIONS_DEBUG)).thenReturn(false);

        formatter.init((ConfigurationSource) cfg, (Options) options);
        assert (formatter.isInitialized());
    }

}