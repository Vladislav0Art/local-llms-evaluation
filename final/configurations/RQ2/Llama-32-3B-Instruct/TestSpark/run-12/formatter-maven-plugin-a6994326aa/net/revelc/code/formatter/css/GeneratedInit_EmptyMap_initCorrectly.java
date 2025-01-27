package net.revelc.code.formatter.css;

public class GeneratedInit_EmptyMap_initCorrectly {

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
    public void init_EmptyMap_initCorrectly() throws Exception {
        String result = doFormat("", LineEnding.LF);
        assertEquals("", result);
    }

}