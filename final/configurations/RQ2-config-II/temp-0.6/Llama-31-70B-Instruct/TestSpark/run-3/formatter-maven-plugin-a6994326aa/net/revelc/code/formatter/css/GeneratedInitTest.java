package net.revelc.code.formatter.css;

public class GeneratedInitTest {

    private CssFormatter formatter;

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource() {
            @Override
            public String getProperty(String key) {
                return "value";
            }
        };
        formatter = new CssFormatter();
        formatter.init(options, cfg);
    }

}