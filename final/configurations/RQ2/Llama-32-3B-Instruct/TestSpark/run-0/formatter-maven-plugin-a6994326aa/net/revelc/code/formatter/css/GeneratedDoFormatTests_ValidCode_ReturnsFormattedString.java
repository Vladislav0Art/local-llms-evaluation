package net.revelc.code.formatter.css;

public class GeneratedDoFormatTests_ValidCode_ReturnsFormattedString {

    private CssFormatter formatter;

    @Before
    public void initFormatter() {
        final Map<String, String> options = Collections.emptyMap();
        final ConfigurationSource cfg = new ConfigurationSource();
        this.formatter = new CssFormatter();
        this.formatter.init(options, cfg);
    }

    @Test
    public void doFormatTests_ValidCode_ReturnsFormattedString() throws IOException {
        final String code = ".test { width: 100px; }";
        final LineEnding ending = LineEnding.LF;
        assertEquals("width: 100px;", formatter.doFormat(code, ending));
    }

}