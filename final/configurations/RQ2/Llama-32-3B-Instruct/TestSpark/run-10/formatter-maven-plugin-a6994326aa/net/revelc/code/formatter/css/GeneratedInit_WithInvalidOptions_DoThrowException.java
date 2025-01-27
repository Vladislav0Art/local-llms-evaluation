package net.revelc.code.formatter.css;

public class GeneratedInit_WithInvalidOptions_DoThrowException {

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
    public void init_WithInvalidOptions_DoThrowException() {
        Map<String, String> options = new HashMap<>();
        options.put("invalid", "value");
        when(cssFormatter.getConfigurationSource()).thenReturn(cfg);
        assertThrows(InvalidOptionError.class, () -> cssFormatter.init(options, cfg));
    }

}