package net.revelc.code.formatter.css;

public class GeneratedTest {

    private net.revelc.code.formatter.CssFormatter cssFormatter = new net.revelc.code.formatter.CssFormatter();

    @Test
    public void initInitializationSuccess() {
        Map<String, String> options = new java.util.HashMap<>();
        ConfigurationSource cfg = null;
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initInitializationFailure() {
        Map<String, String> options = new java.util.HashMap<>();
        ConfigurationSource cfg = null;
        cssFormatter.init(null, cfg);
        assertFalse(cssFormatter.isInitialized());
    }

    @Test
    public void isInitializedFalseWhenNotInitialized() {
        cssFormatter.init(null, null);
        assertFalse(cssFormatter.isInitialized());
    }

}