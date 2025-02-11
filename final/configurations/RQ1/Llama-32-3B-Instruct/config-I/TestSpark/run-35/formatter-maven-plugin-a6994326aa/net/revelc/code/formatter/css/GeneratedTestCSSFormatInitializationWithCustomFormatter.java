package net.revelc.code.formatter.css;

public class GeneratedTestCSSFormatInitializationWithCustomFormatter {

    private boolean initialized = false;
    private boolean useSourceStringValues = true;

    public void setFormatter(CSSFormat formatter) {
        this.formatter = formatter;
        initialized = true;
    }

    public void setUseSourceStringValues(boolean useSourceStringValues) {
        this.useSourceStringValues = useSourceStringValues;
    }

    public boolean isInitialized() {
        return initialized;
    }
}

public class CSSFormatInitTest {

    @Test
    public void testCSSFormatInitializationWithCustomFormatter() {
        CSSFormat cssFormat = new CSSFormat();
        cssFormat.setFormatter(new CSSFormat());
        assert cssFormat.isInitialized();
    }
}

}