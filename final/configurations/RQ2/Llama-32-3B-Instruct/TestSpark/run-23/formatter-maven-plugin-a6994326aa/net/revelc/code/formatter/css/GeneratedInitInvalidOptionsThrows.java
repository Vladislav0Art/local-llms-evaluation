package net.revelc.code.formatter.css;

public class GeneratedInitInvalidOptionsThrows {

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
        public void initInvalidOptionsThrows() {
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

    }