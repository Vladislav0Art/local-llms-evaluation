package net.revelc.code.formatter.css;

public class GeneratedIsInitialized_SimpleTest {

    @Test
    public void isInitialized_SimpleTest() throws IOException {
        Map<String, String> options = Collections.emptyMap();
        ConfigurationSource cfg = null;
        CssFormatter formatter = new CssFormatter(options, cfg);
        assert !formatter.isInitialized() : "isInitialized failed";
    }

}