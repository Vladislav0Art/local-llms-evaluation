package net.revelc.code.formatter.css;

public class GeneratedIsInitialized_ReturnsTrueAfterInitialization {

    private CssFormatter cssFormatter;

    @Before
    public void setup() {
        cssFormatter = new CssFormatter();
    }

    @Mock
    private CSSOMParser parser;

    @Mock
    private SACParserCSS3 parser3;

    @Mock
    private ConfigurationSource cfg;

    @Test
    public void isInitialized_ReturnsTrueAfterInitialization() {
        Map<String, String> options = new HashMap<>();
        when(cssFormatter.getConfigurationSource()).thenReturn(cfg);
        cssFormatter.init(options, cfg);
        boolean result = cssFormatter.isInitialized();
        assertTrue(result);
    }

}