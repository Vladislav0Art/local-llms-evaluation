package net.revelc.code.formatter.css;

public class GeneratedDoFormat_WellFormedCssWithLineBreak {

    private ConfigurationSource cfg;

    @Before
    public void setup() {
        this.cfg = mock(ConfigurationSource.class);
        MockitoAnnotations.initMocks(this);
    }

    public static String doFormat(String inputCss, LineEnding lineEnding) {
        StringWriter output = new StringWriter();
        CssFormatter formatter = new CssFormatter();
        return formatter.format(inputCss, output, lineEnding);
    }

    public static boolean isInitialized() {
        return CssFormatter.instance.isInitialized();
    }

    @Test
    public void doFormat_WellFormedCssWithLineBreak() throws Exception {
        String cssCode = "body { color: red; }\n";
        String expected = "body{color: red;}\n\n";
        String result = doFormat(cssCode, LineEnding.LF);
        assertEquals(expected, result);
    }

}