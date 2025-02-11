package net.revelc.code.formatter.css;

public class GeneratedTestCSSFormatterInitialization {

    private boolean initialized = false;
    private boolean useSourceStringValues = true;

    public void setFormatter(CSSFormatter formatter) {
        this.formatter = formatter;
        initialized = true;
    }

    public void setUseSourceStringValues(boolean useSourceStringValues) {
        this.useSourceStringValues = useSourceStringValues;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public String formatCode(String cssCode) {
        if (useSourceStringValues) {
            return "/* " + cssCode + " */";
        } else {
            return cssCode;
        }
    }
}

public class CSSFormatterTest {

    @Test
    public void testCSSFormatterInitialization() {
        CSSFormatter cssFormatter = new CSSFormatter();
        assert !cssFormatter.isInitialized();

        cssFormatter.setFormatter(null);
        assert !cssFormatter.isInitialized();

        cssFormatter.setFormatter(new CSSFormatter());
        assert cssFormatter.isInitialized();
    }

}