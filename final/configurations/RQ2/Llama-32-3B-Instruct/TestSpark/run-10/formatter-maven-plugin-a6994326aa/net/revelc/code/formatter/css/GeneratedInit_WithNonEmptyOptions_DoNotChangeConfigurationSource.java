package net.revelc.code.formatter.css;

public class GeneratedInit_WithNonEmptyOptions_DoNotChangeConfigurationSource {

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
    public void init_WithNonEmptyOptions_DoNotChangeConfigurationSource() {
        Map<String, String> options = new HashMap<>();
        options.put("option", "value");
        when(cssFormatter.getConfigurationSource()).thenReturn(cfg);
        cssFormatter.init(options, cfg);
        assertEquals(cfg, cssFormatter.getConfigurationSource());
    }

}