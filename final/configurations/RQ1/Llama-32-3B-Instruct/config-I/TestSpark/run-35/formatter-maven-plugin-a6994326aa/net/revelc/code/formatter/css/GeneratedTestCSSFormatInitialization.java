package net.revelc.code.formatter.css;

public class GeneratedTestCSSFormatInitialization {

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
    public void testCSSFormatInitialization() {
        CSSFormat cssFormat = new CSSFormat();
        assert !cssFormat.isInitialized();

        cssFormat.setFormatter(null);
        assert !cssFormat.isInitialized();

        cssFormat.setUseSourceStringValues(false);
        assert !cssFormat.isInitialized();

        CSSFormat formatter = new CSSFormat();
        cssFormat.setFormatter(formatter);
        assert cssFormat.isInitialized();

        assert !formatter.isInitialized();
    }

}