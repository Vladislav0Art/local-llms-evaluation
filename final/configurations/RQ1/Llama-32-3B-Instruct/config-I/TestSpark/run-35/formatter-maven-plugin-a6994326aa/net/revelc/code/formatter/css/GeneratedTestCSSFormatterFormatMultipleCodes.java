package net.revelc.code.formatter.css;

public class GeneratedTestCSSFormatterFormatMultipleCodes {

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
    public void testCSSFormatterFormatMultipleCodes() {
        CSSFormatter cssFormatter = new CSSFormatter();
        String cssCode1 = "test code 1";
        String cssCode2 = "test code 2";
        String formattedCssCode1 = cssFormatter.formatCode(cssCode1);
        String formattedCssCode2 = cssFormatter.formatCode(cssCode2);
        assert formattedCssCode1.equals("/* " + cssCode1 + " */");
        assert formattedCssCode2.equals("/* " + cssCode2 + " */");
    }

}