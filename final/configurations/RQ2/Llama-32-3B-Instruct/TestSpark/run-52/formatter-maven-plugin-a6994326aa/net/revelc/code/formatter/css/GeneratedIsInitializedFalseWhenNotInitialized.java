package net.revelc.code.formatter.css;

public class GeneratedIsInitializedFalseWhenNotInitialized {

    private CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void isInitializedFalseWhenNotInitialized() throws java.io.IOException {
        String code = cssFormatter.doFormat(code, net.revelc.code.formatter.LineEnding.CRLF);
        assertEquals(false, cssFormatter.isInitialized());
    }

}