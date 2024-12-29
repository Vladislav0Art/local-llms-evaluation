package net.revelc.code.formatter.css;

public class GeneratedInitTests_ValidOptions_ReturnsTrue {

    private CssFormatter formatter;

    @Before
    public void initFormatter() {
        final Map<String, String> options = Collections.emptyMap();
        final ConfigurationSource cfg = new ConfigurationSource();
        this.formatter = new CssFormatter();
        this.formatter.init(options, cfg);
    }

    @Test
    public void initTests_ValidOptions_ReturnsTrue() {
        final Map<String, String> options = Collections.singletonMap("test", "value");
        final ConfigurationSource cfg = new ConfigurationSource();
        assertEquals(true, formatter.isInitialized());
    }

}