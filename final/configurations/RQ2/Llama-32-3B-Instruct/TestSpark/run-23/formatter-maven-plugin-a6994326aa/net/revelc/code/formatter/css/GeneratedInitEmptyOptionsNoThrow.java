package net.revelc.code.formatter.css;

public class GeneratedInitEmptyOptionsNoThrow {

    public static enum LineEnding {
        LF,
        CRLF
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

    public static class GeneratedTest {

        @Test
        public void initEmptyOptionsNoThrow() {
            Map<String, String> options = new java.util.HashMap<>();
            ConfigurationSource cfg = null;
            CssFormatter formatter = new CssFormatter();
            formatter.init(options, cfg);
        }

    }