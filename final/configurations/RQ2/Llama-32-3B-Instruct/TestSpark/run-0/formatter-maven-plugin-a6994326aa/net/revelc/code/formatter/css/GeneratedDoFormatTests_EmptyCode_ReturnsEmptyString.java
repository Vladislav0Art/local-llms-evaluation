package net.revelc.code.formatter.css;

public class GeneratedDoFormatTests_EmptyCode_ReturnsEmptyString {

    private CssFormatter formatter;

    @Before
    public void initFormatter() {
        final Map<String, String> options = Collections.emptyMap();
        final ConfigurationSource cfg = new ConfigurationSource();
        this.formatter = new CssFormatter();
        this.formatter.init(options, cfg);
    }

    @Test
    public void doFormatTests_EmptyCode_ReturnsEmptyString() throws IOException {
        final String code = "";
        final LineEnding ending = LineEnding.LF;
        assertEquals("", formatter.doFormat(code, ending));
    }

}