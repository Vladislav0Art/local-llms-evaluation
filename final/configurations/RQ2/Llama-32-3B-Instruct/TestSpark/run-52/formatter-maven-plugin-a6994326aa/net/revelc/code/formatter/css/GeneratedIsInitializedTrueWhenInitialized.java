package net.revelc.code.formatter.css;

public class GeneratedIsInitializedTrueWhenInitialized {

    private CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void isInitializedTrueWhenInitialized() throws java.io.IOException {
        String code = cssFormatter.doFormat(code, net.revelc.code.formatter.LineEnding.CRLF);
        assertTrue(cssFormatter.isInitialized());
    }
}

class CssFormatter extends net.revelc.code.formatter.AbstractCacheableFormatter implements net.revelc.code.formatter.Formatter {
    @Override
    public void init(java.util.Map<String, String> options, net.revelc.code.formatter.ConfigurationSource cfg) { /* implementation */ }

    @Override
    protected String doFormat(String code, net.revelc.code.formatter.LineEnding ending) throws java.io.IOException {
        return "";
    }

    @Override
    public boolean isInitialized() {
        return true;
    }
}

}