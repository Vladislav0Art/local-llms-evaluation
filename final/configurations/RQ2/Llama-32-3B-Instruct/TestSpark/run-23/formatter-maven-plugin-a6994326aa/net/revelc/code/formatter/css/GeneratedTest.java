package net.revelc.code.formatter.css;

public class GeneratedTest {

    @Test
    public void testInitEmptyOptionsNoThrow() {
        Map<String, String> options = new java.util.HashMap<>();
        ConfigurationSource cfg = null;
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
    }

    @Test
    public void testInitInvalidOptionsThrows() {
        Map<String, String> options = new java.util.HashMap<>();
        options.put("invalid", "option");
        ConfigurationSource cfg = null;
        try {
            CssFormatter formatter = new CssFormatter();
            formatter.init(options, cfg);
            assert false;
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testDoFormatEmptyInputReturnsEmpty() throws Exception {
        String input = "";
        LineEnding ending = CssFormatter.LineEnding.LF;
        CssFormatter(formatter) = new CssFormatter();
        assertEquals("", formatter.format(input, ending));
    }

    @Test
    public void testDoFormatNonEmptyInputReturnsCorrectOutput() throws Exception {
        String input = "test";
        LineEnding ending = CssFormatter.LineEnding.LF;
        CssFormatter(formatter) = new CssFormatter();
        assertEquals("test\n", formatter.format(input, ending));
    }
}

public class CssFormatter {

    public enum LineEnding {
        LF,
        CRLF
    }

    public void init(Map<String, String> options, ConfigurationSource cfg) throws Exception {
        // implementation
    }

    public String format(String input, LineEnding ending) {
        StringBuilder output = new StringBuilder();
        for (String s : input.split("\n")) {
            switch (ending) {
                case LF:
                    output.append(s).append("\n");
                    break;
                case CRLF:
                    output.append(s).append("\r\n");
                    break;
            }
        }
        return output.toString().trim();
    }

    public static class ConfigurationSource {
        // implementation
    }

    public static void main(String[] args) throws Exception {
        GeneratedTest test = new GeneratedTest();
        test.testInitEmptyOptionsNoThrow();
        test.testInitInvalidOptionsThrows();
        test.testDoFormatEmptyInputReturnsEmpty();
        test.testDoFormatNonEmptyInputReturnsCorrectOutput();
    }

}