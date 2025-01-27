package net.revelc.code.formatter.css;

public class GeneratedTestInitWithEmptyOptions {

    @Test
    public void testInitWithEmptyOptions() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
    }

}