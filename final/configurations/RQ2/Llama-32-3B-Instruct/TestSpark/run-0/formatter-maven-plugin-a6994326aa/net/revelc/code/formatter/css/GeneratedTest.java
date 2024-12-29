package net.revelc.code.formatter.css;

public class GeneratedTest {

    private CssFormatter formatter;

    @Before
    public void initFormatter() {
        final Map<String, String> options = Collections.emptyMap();
        final ConfigurationSource cfg = new ConfigurationSource();
        this.formatter = new CssFormatter();
        this.formatter.init(options, cfg);
    }

}