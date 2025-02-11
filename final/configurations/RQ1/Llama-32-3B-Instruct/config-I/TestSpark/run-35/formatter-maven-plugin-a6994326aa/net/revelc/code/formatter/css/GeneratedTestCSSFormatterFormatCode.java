package net.revelc.code.formatter.css;

public class GeneratedTestCSSFormatterFormatCode {

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
    public void testCSSFormatterFormatCode() {
        CSSFormatter cssFormatter = new CSSFormatter();
        String cssCode = "test code";
        String formattedCssCode = cssFormatter.formatCode(cssCode);
        assert formattedCssCode.equals("/* " + cssCode + " */");
    }

}