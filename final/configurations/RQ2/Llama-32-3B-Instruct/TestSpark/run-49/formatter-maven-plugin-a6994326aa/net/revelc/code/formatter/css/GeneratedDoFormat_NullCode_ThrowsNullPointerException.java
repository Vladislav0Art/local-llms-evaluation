package net.revelc.code.formatter.css;

public class GeneratedDoFormat_NullCode_ThrowsNullPointerException {

    private String value;

    public LineEnding() {
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

public class ConfigurationSource {
    // configuration source implementation
}

public class CssFormatter {
    private static CssFormatter instance;

    public static CssFormatter getInstance() {
        if (instance == null) {
            instance = new CssFormatter();
        }
        return instance;
    }

    public boolean init(Map<String, String> options, ConfigurationSource cfg) {
        // initialization logic
        return true;
    }

    public void doFormat(String code, LineEnding ending) {
        // format logic
    }

    public static boolean isInitialized() {
        return false;
    }
}

public class GeneratedTest {

    @Test
    public void doFormat_NullCode_ThrowsNullPointerException() {
        final String code = null;
        assertThrows(NullPointerException.class, () -> CssFormatter.getInstance().doFormat(code, null));
    }

}