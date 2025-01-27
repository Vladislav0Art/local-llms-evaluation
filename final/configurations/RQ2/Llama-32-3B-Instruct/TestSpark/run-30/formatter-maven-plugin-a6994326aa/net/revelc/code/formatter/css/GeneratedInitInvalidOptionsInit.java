package net.revelc.code.formatter.css;

public class GeneratedInitInvalidOptionsInit {

    private CssFormatter cssFormatter;

    @Test
    public void initInvalidOptionsInit() {
        Map<String, String> options = null;
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);
    }

    private static class ConfigurationSourceStub extends ConfigurationSource {
        @Override
        public boolean isInitialized() {
            return true;
        }
    }

}