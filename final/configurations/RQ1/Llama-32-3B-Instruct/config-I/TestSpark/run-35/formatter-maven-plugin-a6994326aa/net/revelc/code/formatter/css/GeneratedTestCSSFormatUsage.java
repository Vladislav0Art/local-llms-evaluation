package net.revelc.code.formatter.css;

public class GeneratedTestCSSFormatUsage {

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
    public void testCSSFormatUsage() {
        CSSFormat cssFormat = new CSSFormat();
        assert !cssFormat.isInitialized();

        cssFormat.setUseSourceStringValues(false);
        assert !cssFormat.isInitialized();

        String formattedCss = cssFormat.formatCode("/* comment */");
        assert !formattedCss.contains("/* comment */");

        cssFormat.setFormatter(new CSSFormat());
        assert cssFormat.isInitialized();
    }

}