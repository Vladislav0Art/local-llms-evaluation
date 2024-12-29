package net.revelc.code.formatter.css;

public class GeneratedIsInitializedTests_InitiatedFormatter_ReturnsTrue {

    private CssFormatter formatter;

    @Before
    public void initFormatter() {
        final Map<String, String> options = Collections.emptyMap();
        final ConfigurationSource cfg = new ConfigurationSource();
        this.formatter = new CssFormatter();
        this.formatter.init(options, cfg);
    }

    @Test
    public void isInitializedTests_InitiatedFormatter_ReturnsTrue() {
        assertTrue(formatter.isInitialized());
    }

}