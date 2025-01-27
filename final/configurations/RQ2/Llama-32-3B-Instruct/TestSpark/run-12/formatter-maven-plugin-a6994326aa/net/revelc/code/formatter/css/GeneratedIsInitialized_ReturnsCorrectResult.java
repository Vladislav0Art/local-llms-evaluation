package net.revelc.code.formatter.css;

public class GeneratedIsInitialized_ReturnsCorrectResult {

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
    public void isInitialized_ReturnsCorrectResult() {
        boolean result = CssFormatter.instance.isInitialized();
        //Note: instance was made static and made private
    }
}

}