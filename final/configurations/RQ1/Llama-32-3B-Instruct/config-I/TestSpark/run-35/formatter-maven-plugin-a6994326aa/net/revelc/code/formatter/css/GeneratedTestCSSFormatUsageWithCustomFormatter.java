package net.revelc.code.formatter.css;

public class GeneratedTestCSSFormatUsageWithCustomFormatter {

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
    public void testCSSFormatUsageWithCustomFormatter() {
        CSSFormat formatter = new CSSFormat();
        CSSFormat cssFormat = new CSSFormat();
        cssFormat.setFormatter(formatter);
        assert cssFormat.isInitialized();

        String formattedCss = cssFormat.formatCode("/* comment */");
        assert !formattedCss.contains("/* comment */");

        // No effect from custom formatter
    }

}