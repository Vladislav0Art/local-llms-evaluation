package net.revelc.code.formatter.css;

public class GeneratedInitTests_NoOptions_ThrowsException {

    private CssFormatter formatter;

    @Before
    public void initFormatter() {
        final Map<String, String> options = Collections.emptyMap();
        final ConfigurationSource cfg = new ConfigurationSource();
        this.formatter = new CssFormatter();
        this.formatter.init(options, cfg);
    }

    @Test
    public void initTests_NoOptions_ThrowsException() {
        assertThrows(IOException.class, () -> formatter.init(Collections.emptyMap(), new ConfigurationSource()));
    }

}