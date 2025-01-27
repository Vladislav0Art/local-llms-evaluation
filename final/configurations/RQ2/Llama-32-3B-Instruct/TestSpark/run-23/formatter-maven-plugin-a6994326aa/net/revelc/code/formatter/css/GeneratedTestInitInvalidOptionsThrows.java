package net.revelc.code.formatter.css;

public class GeneratedTestInitInvalidOptionsThrows {

    @Test
    public void testInitInvalidOptionsThrows() {
        Map<String, String> options = new java.util.HashMap<>();
        options.put("invalid", "option");
        ConfigurationSource cfg = null;
        try {
            CssFormatter formatter = new CssFormatter();
            formatter.init(options, cfg);
            assert false;
        } catch (Exception e) {
            // expected
        }
    }

}