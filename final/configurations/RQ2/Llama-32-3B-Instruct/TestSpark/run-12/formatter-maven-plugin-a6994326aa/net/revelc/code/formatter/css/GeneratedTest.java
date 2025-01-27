package net.revelc.code.formatter.css;

public class GeneratedTest {

    private static boolean initialized = false;

    public static boolean isInitialized() {
        return initialized;
    }

    public static void init(ConfigurationSource cfg) {
        initialized = true;
    }

    public String format(String inputCss, StringWriter output, LineEnding lineEnding) {
        // implementation of the format method
        return "";
    }
}

public class CssFormatterTest {

    private CssFormatter formatter;

    @Before
    public void setup() {
        this.formatter = new CssFormatter();
        this.formatter.init(new ConfigurationSource());
    }

    public static String doFormat(String inputCss, LineEnding lineEnding) {
        StringWriter output = new StringWriter();
        return formatter.format(inputCss, output, lineEnding);
    }

}