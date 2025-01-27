package net.revelc.code.formatter.css;

public class GeneratedDoFormat_EmptyString_ReturnsEmptyString {

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
    public void doFormat_EmptyString_ReturnsEmptyString() {
        when(parser3.parse(anyString())).thenReturn(new CSSStyleSheetImpl());
        String result = cssFormatter.doFormat("", LineEnding.LF);
        assertEquals("", result);
    }

}