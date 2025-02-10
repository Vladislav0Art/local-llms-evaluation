package net.revelc.code.formatter.css;

public class GeneratedIsInitialized_failing {

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
    public void isInitialized_failing() {
        assertTrue(formatter.isInitialized());
    }

}