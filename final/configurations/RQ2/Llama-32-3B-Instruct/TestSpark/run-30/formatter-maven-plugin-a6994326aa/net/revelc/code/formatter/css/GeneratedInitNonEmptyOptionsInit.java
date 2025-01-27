package net.revelc.code.formatter.css;

public class GeneratedInitNonEmptyOptionsInit {

    private CssFormatter cssFormatter;

    @Test
    public void initNonEmptyOptionsInit() {
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);
        assertNotNull(cssFormatter);
    }

}