package net.revelc.code.formatter.css;

public class GeneratedDoFormat_InvalidCss_ThrowsIOException {

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
    public void doFormat_InvalidCss_ThrowsIOException() {
        when(parser3.parse(anyString())).thenThrow(IOException.class);
        assertThrows(IOException.class, () -> cssFormatter.doFormat("", LineEnding.LF));
    }

}