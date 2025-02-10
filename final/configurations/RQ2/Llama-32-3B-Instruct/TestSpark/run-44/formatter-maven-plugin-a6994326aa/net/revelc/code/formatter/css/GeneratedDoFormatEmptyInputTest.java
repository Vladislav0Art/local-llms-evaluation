package net.revelc.code.formatter.css;

public class GeneratedDoFormatEmptyInputTest {

    // ... implementation ...
}

public enum LineEnding {
    LF, CRLF
}

public interface CssFormatter {
    boolean isInitialized();

    void init(Map<String, String> options, ConfigurationSource cfg);

    String doFormat(String code, LineEnding lineEnding);
}

public class CssFormatterImpl implements CssFormatter {
    private boolean initialized;

    @Override
    public boolean isInitialized() {
        return initialized;
    }

    @Override
    public void init(Map<String, String> options, ConfigurationSource cfg) {
        // ... implementation ...
        this.initialized = true;
    }

    @Override
    public String doFormat(String code, LineEnding lineEnding) {
        switch (lineEnding) {
            case LF:
                return code.replace("\n", "\n");
            case CRLF:
                return code.replace("\n", "\r\n");
            default:
                throw new UnsupportedOperationException();
        }
    }
}

public class GeneratedTest {

    @Test
    public void doFormatEmptyInputTest() {
        CssFormatter formatter = new CssFormatterImpl();
        String code = "";
        LineEnding lineEnding = LineEnding.LF;
        assertEquals("", formatter.doFormat(code, lineEnding));
    }

}