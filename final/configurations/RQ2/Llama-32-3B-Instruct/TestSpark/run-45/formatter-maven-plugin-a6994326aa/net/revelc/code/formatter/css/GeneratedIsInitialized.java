package net.revelc.code.formatter.css;

public class GeneratedIsInitialized {

    private String format;

    public CssFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}

public enum LineEnding {
    LF,
    CRLF
}

public class FormatterTest {

    @Test
    public void isInitialized() {
        assertFalse(formatter.isInitialized());
    }

}