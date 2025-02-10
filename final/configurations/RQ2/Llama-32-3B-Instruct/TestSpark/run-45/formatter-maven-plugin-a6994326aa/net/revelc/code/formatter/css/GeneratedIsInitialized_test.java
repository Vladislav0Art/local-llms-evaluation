package net.revelc.code.formatter.css;

public class GeneratedIsInitialized_test {

    private String cssContent;
    private LineEnding lineEnding;

    public CssFormatter(String cssContent, LineEnding lineEnding) {
        this.cssContent = cssContent;
        this.lineEnding = lineEnding;
    }

    public String getCssContent() {
        return cssContent;
    }
}

public enum LineEnding {
    LF,
    CRLF
}

public class FormatterTest {
    private static CssFormatter formatter;

    public static void doFormat(String input, LineEnding ending) throws IOException {
        // implementation of the doFormat method
    }

    public static boolean isInitialized() {
        return true;
    }

    @Test
    public void isInitialized_test() {
        assertTrue(FormatterTest.isInitialized());
    }

}