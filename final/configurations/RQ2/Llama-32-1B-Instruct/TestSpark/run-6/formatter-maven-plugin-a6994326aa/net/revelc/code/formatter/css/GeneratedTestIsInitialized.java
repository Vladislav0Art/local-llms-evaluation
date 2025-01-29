package net.revelc.code.formatter.css;

public class GeneratedTestIsInitialized {

    @Test
    public void testIsInitialized() {
        // mock options map and no initialization required
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = MockConfigurationSource.create();
        CssFormatter instance = new CssFormatter(options, cfg);
        assertInstanceInitialized(instance);
    }

}