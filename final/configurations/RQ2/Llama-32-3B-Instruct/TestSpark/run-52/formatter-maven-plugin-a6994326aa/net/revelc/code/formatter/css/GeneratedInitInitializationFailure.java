package net.revelc.code.formatter.css;

public class GeneratedInitInitializationFailure {

    private CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void initInitializationFailure() {
        java.util.HashMap<String, String> options = new java.util.HashMap<>();
        net.revelc.code.formatter.ConfigurationSource cfg = null;
        cssFormatter.init(null, cfg);
        assertFalse(cssFormatter.isInitialized());
    }

}