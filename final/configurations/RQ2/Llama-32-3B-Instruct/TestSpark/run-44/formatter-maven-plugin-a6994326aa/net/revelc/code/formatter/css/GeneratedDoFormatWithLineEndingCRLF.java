package net.revelc.code.formatter.css;

public class GeneratedDoFormatWithLineEndingCRLF {

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
    public void doFormatWithLineEndingCRLF() {
        CssFormatter formatter = new CssFormatterImpl();
        String code = "code with \nline ending \ncrlf";
        LineEnding lineEnding = LineEnding.CRLF;
        assertEquals("code with \r\nline ending\r\n", formatter.doFormat(code, lineEnding));
    }

}