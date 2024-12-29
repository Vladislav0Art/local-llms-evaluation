package net.revelc.code.formatter.css;

public class GeneratedDoFormatTests_NullCode_ThrowsException {

    private CssFormatter formatter;

    @Before
    public void initFormatter() {
        final Map<String, String> options = Collections.emptyMap();
        final ConfigurationSource cfg = new ConfigurationSource();
        this.formatter = new CssFormatter();
        this.formatter.init(options, cfg);
    }

    @Test
    public void doFormatTests_NullCode_ThrowsException() {
        final String code = null;
        final LineEnding ending = LineEnding.LF;
        assertThrows(IOException.class, () -> formatter.doFormat(code, ending));
    }

}