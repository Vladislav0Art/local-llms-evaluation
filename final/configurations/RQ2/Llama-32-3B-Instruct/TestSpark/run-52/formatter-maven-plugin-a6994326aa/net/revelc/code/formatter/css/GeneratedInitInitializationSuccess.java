package net.revelc.code.formatter.css;

public class GeneratedInitInitializationSuccess {

    private CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void initInitializationSuccess() {
        java.util.HashMap<String, String> options = new java.util.HashMap<>();
        net.revelc.code.formatter.ConfigurationSource cfg = null;
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

}