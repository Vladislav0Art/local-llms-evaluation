package net.revelc.code.formatter.css;

public class GeneratedTest {

    private CssFormatter cssFormatter;

    @Test
    public void initEmptyOptionsInit() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);
        assertNotNull(cssFormatter);
    }

    @Test
    public void initNonEmptyOptionsInit() {
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);
        assertNotNull(cssFormatter);
    }

    @Test
    public void initInvalidOptionsInit() {
        Map<String, String> options = null;
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);
    }

    private static class ConfigurationSourceStub extends ConfigurationSource {
        @Override
        public boolean isInitialized() {
            return true;
        }
    }

    @Test
    public void doFormatEmptyCodeFormat() throws IOException {
        String code = "";
        LineEnding ending = LineEnding.LF;
        cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSourceStub());
        assertEquals("", cssFormatter.doFormat(code, ending));
    }

    @Test
    public void doFormatNonEmptyCodeFormat() throws IOException {
        String code = "body { background-color: #f2f2f2; }";
        LineEnding ending = LineEnding.LF;
        cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSourceStub());
        assertEquals("body { background-color: #f2f2f2; }", cssFormatter.doFormat(code, ending));
    }

    @Test
    public void doFormatMultipleLinesFormat() throws IOException {
        String code = "body {\n" +
                "  font-size: 16px;\n" +
                "}\n" +
                "\n" +
                "#header { color: #333; }";
        LineEnding ending = LineEnding.CRLF;
        cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSourceStub());
        assertEquals(code, cssFormatter.doFormat(code, ending));
    }

    @Test
    public void doFormatInvalidCodeFormat() throws IOException {
        String code = " invalid code";
        LineEnding ending = LineEnding.LF;
        cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSourceStub());
        assertEquals("", cssFormatter.doFormat(code, ending));
    }

    @Test
    public void isInitializedReturnTrue() {
        cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSourceStub());
        assertTrue(cssFormatter.isInitialized());
    }

}