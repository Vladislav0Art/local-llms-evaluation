package net.revelc.code.formatter.css;

public class GeneratedIsInitialized_ReturnsFalseByDefault {

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
    public void isInitialized_ReturnsFalseByDefault() {
        boolean result = cssFormatter.isInitialized();
        assertFalse(result);
    }

}