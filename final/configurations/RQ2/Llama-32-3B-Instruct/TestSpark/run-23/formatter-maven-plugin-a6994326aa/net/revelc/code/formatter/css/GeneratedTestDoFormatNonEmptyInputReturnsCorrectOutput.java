package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatNonEmptyInputReturnsCorrectOutput {

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