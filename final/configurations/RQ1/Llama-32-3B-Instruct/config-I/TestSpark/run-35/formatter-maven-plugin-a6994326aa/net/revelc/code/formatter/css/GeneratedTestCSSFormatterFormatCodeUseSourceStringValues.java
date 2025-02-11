package net.revelc.code.formatter.css;

public class GeneratedTestCSSFormatterFormatCodeUseSourceStringValues {

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
    public void testCSSFormatterFormatCodeUseSourceStringValues() {
        CSSFormatter cssFormatter = new CSSFormatter();
        cssFormatter.setUseSourceStringValues(false);
        String cssCode = "test code";
        String formattedCssCode = cssFormatter.formatCode(cssCode);
        assert formattedCssCode.equals(cssCode);
    }

}