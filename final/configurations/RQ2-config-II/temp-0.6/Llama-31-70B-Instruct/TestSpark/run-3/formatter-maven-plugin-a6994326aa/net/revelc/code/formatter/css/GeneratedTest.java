package net.revelc.code.formatter.css;

public class GeneratedTest {

    private CssFormatter formatter;

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource() {
            @Override
            public String getProperty(String key) {
                return "value";
            }
        };
        formatter = new CssFormatter();
        formatter.init(options, cfg);
    }

    @Test
    public void doFormatTest() throws IOException {
        formatter = new CssFormatter();
        String code = "body {background-color: red;}";
        LineEnding ending = LineEnding.UNIX;
        String formattedCode = formatter.doFormat(code, ending);
        assertNotNull(formattedCode);
    }

    @Test
    public void isInitializedTest() {
        formatter = new CssFormatter();
        boolean initialized = formatter.isInitialized();
        assertTrue(initialized);
    }

}