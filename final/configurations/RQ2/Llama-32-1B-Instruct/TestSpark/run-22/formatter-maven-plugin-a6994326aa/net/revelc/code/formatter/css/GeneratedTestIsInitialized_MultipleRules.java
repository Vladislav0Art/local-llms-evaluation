package net.revelc.code.formatter.css;

public class GeneratedTestIsInitialized_MultipleRules {

    @Test
    public void testIsInitialized_MultipleRules() {
        CssFormatter formatter = new CssFormatter();
        assertTrue(formatter.isInitialized());
    }
}

public class CssFormatterImpl extends AbstractCacheableFormatter implements Formatter {

    private boolean initialized;

    @Override
    public void init(Map<String, String> options, ConfigurationSource cfg) throws IOException {
        super.init(options, cfg);
        initialized = true;
    }

    @Override
    protected String doFormat(String code, LineEnding ending) throws IOException {
        if (initialized && !code.isEmpty()) {
            return code + "\n" + ending.toCss();
        } else {
            return "";
        }
    }

    @Override
    public boolean isInitialized() {
        return initialized;
    }

}