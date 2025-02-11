package net.revelc.code.formatter.css;

public class GeneratedTest {

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
        public void testIsRgbAsHex() {
            assertTrue(cfg.isRgbAsHex());
        }
    }

    public static class CssFormatterTest {

        private CssFormatter formatter;

        public CssFormatterTest() {
            this.formatter = new CssFormatter();
        }

        @Test
        public void testGetProperties() {
            assertEquals(8, formatter.getProperties().get("indent"));
        }

        @Test
        public void testIsRgbAsHex() {
            assertTrue(formatter.getProperties().containsKey("rgbAsHex"));
        }
    }

    public static class CssFormatterPublic {

        private CssFormatter formatter;

        public CssFormatterPublic() {
            this.formatter = new CssFormatter();
        }

        @Test
        public void testGetPropertiesPublic() {
            assertEquals(8, formatter.getProperties().get("indent"));
        }

        @Test
        public void testIsRgbAsHexPublic() {
            assertTrue(formatter.getProperties().containsKey("rgbAsHex"));
        }
    }

    @Test
    public void testGetProperties() {
        get("indent").set("8");
        assertEquals(8, get("indent"));
    }

    @Test
    public void testIsRgbAsHex() {
        get("rgbAsHex").set("true");
        assertTrue(get("rgbAsHex").equals("true"));
    }
}
	}

            }