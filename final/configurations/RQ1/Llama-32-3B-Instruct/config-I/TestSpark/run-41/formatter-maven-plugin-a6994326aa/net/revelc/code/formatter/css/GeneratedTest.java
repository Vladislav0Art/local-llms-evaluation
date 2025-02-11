package net.revelc.code.formatter.css;

public class GeneratedTest {

    public enum NewLine {
        NEWLINE("")
    }

    public static String getNewLine() {
        return "";
    }
}

public class ConfigurationSource {

    public static CssFormatter create() {
        return new CssFormatter();
    }
}

public class CssFormatter {

    private final java.util.Map<String, Object> options;

    public CssFormatter(java.util.Map<String, Object> options) {
        this.options = options;
    }

    public String doFormat(String code, net.revelc.code.formatter.LineEnding lineEnding) {
        // implement formatting logic here
        return "";
    }
}

public class GeneratedTest {

    @Test
    public void testFormatter() {
        final java.util.Map<String, Object> options = java.util.Map.of("indent", "4");
        final CssFormatter formatter = new CssFormatter(options);

        String code = "{\n" +
                "    color: blue;\n" +
                "}";
        String expectedOutput = "\tcolor: blue;\n";

        assertEquals(expectedOutput, formatter.doFormat(code, net.revelc.code.formatter.LineEnding.NEWLINE));
    }

    @Test
    public void testFormatterIoException() {
        final CssFormatter formatter = new CssFormatter();

        String code = "{\n" +
                "    color: blue;\n" +
                "}";
        assertThrows(net.revelc.code.formatter.IOException.class, () -> formatter.doFormat(code, net.revelc.code.formatter.LineEnding.NEWLINE));
    }

    @Test
    public void testFormatterNoOutput() {
        final CssFormatter formatter = new CssFormatter();

        String code = "{\n" +
                "    color: blue;\n" +
                "}";
        String expectedOutput = "";

        assertEquals(expectedOutput, formatter.doFormat(code, net.revelc.code.formatter.LineEnding.NEWLINE));
    }

}