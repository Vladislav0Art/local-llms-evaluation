package net.revelc.code.formatter.css;

public class GeneratedDoFormat_ValidCss_ReturnsFormattedCss {

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
    public void doFormat_ValidCss_ReturnsFormattedCss() {
        String css = "{ body { background-color: #f2f2f2; } }";
        when(parser3.parse(anyString())).thenReturn(new CSSStyleSheetImpl());
        String result = cssFormatter.doFormat(css, LineEnding.LF);
        assertEquals("{\n  body {\n    background-color: #f2f2f2;\n  }\n}", result);
    }

}