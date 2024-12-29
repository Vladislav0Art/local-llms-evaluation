package net.revelc.code.formatter.css;

public class GeneratedIsInitializedTests_UninitializedFormatter_ReturnsFalse {

    private CssFormatter formatter;

    @Before
    public void initFormatter() {
        final Map<String, String> options = Collections.emptyMap();
        final ConfigurationSource cfg = new ConfigurationSource();
        this.formatter = new CssFormatter();
        this.formatter.init(options, cfg);
    }

    @Test
    public void isInitializedTests_UninitializedFormatter_ReturnsFalse() {
        CssFormatter uninitialized = new CssFormatter();
        assertFalse(uninitialized.isInitialized());
    }
}

}