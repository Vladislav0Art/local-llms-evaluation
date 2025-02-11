package net.revelc.code.formatter.css;

public class GeneratedTestGetProperties {

    public static class MapOptions {
        private Map<String, String> options;

        public MapOptions(Map<String, String> options) {
            this.options = options;
        }

        public void init(CssFormatter formatter, ConfigurationSource cfg) {
            formatter.init(options, cfg);
        }

        public Map<String, String> getProperties() {
            return new java.util.HashMap<>();
        }

        public boolean isRgbAsHex(CssFormatter formatter) {
            return formatter.getProperties().containsKey("rgbAsHex");
        }
    }

    public static class ConfigurationSourceTest {

        private ConfigurationSource cfg;

        public ConfigurationSourceTest() {
            this.cfg = new ConfigurationSource("true");
        }

        @Test
        public void testGetProperties() {
            get("indent").set("8");
            assertEquals(8, get("indent"));
        }

    }