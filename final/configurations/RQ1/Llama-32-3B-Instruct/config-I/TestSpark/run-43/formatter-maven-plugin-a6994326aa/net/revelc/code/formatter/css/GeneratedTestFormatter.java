package net.revelc.code.formatter.css;

public class GeneratedTestFormatter {

    LF(""),

    CRLF("");

    private String ending;

    public LineEnding(String ending) {
        this.ending = ending;
    }

    public String getLineEnding() {
        return ending;
    }
}

public interface ConfigurationSource {
    void setFormat(CSSFormat format);

    CSSFormat getFormat();
}

public class CssFormatter {
    private CSSFormat formatter;
    private LineEnding lineEnding;

    public CssFormatter() {
    }

    public boolean isInitialized() {
        return false;
    }

    public String doFormat(String code, LineEnding ending) throws Exception {
    }

    public CSSFormat getFormatter() {
        return null;
    }
}

public class GeneratedTest {

    @Rule
    public TestRule testRule = new TestRule();

    private CssFormatter formatter;

    @Before
    public void setup() throws Exception {
        // implementation
        this.formatter = new CssFormatter();
        this.formatter.setLineEnding(LineEnding.LF);
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        cfg.setFormat(mock(CSSFormat.class));
        this.formatter.setFormat((CSSFormat) cfg.getFormat());
    }

    @Test
    public void testFormatter() {
        assertTrue(formatter.isInitialized());
        assertEquals(0, ((CssFormatter) new CssFormatter()).getIndent());
        final var result = new CssFormatter().doFormat("code", LineEnding.LF);
        assertEquals(null, result);
    }

}