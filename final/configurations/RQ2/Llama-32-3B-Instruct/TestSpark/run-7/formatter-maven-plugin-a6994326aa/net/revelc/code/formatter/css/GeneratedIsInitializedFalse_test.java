package net.revelc.code.formatter.css;

public class GeneratedIsInitializedFalse_test {

    private CssFormatter formatter;

    @Test
    public void isInitializedFalse_test() {
        boolean initialized = formatter.isInitialized();
        assertFalse(initialized);
    }
}

public class ConfigurationSourceMock {

    private Map<String, String> options;

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

}