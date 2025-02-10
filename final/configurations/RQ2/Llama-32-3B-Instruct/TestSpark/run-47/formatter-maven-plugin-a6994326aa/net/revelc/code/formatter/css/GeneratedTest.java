package net.revelc.code.formatter.css;

public class GeneratedTest {

    private LineEnding lineEnding;

    public void init(Map<String, String> options, ConfigurationSource configurationSource) {
        this.lineEnding = LineEnding.LF;
    }

    public String doFormat(String code, LineEnding lineEnding) {
        return code.replace("\r\n", lineEnding.getValue());
    }
}

public class GeneratedTest {

    private CssFormatter cssFormatter;

    @Before
    public void setup() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void isInitialized_IsFalse() {
        boolean result = new CssFormatter().isInitialized();
        assertFalse(result);
    }

}