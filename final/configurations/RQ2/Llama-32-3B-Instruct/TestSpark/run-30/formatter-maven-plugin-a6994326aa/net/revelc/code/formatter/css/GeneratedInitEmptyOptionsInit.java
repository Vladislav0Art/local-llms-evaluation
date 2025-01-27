package net.revelc.code.formatter.css;

public class GeneratedInitEmptyOptionsInit {

    private CssFormatter cssFormatter;

    @Test
    public void initEmptyOptionsInit() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);
        assertNotNull(cssFormatter);
    }

}