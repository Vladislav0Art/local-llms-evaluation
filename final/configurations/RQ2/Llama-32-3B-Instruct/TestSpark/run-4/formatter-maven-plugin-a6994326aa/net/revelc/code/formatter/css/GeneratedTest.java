package net.revelc.code.formatter.css;

public class GeneratedTest {

    private boolean initialized;

    public boolean init(Map<String, String> options) {
        // do nothing
        this.initialized = true;
        return true;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public String doFormat(String code, LineEnding ending) {
        switch (ending) {
            case LF:
                return "formatted";
            case CRLF:
                return "formatted\n";
            default:
                throw new RuntimeException("Unsupported line ending");
        }
    }
}

public class GeneratedTest {

}