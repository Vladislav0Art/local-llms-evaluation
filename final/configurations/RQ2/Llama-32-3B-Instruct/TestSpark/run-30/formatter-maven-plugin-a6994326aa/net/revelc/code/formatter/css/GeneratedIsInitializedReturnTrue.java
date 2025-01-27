package net.revelc.code.formatter.css;

public class GeneratedIsInitializedReturnTrue {

    private CssFormatter cssFormatter;

    @Test
    public void isInitializedReturnTrue() {
        cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSourceStub());
        assertTrue(cssFormatter.isInitialized());
    }

}