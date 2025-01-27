package net.revelc.code.formatter.css;

public class GeneratedDoFormatEmptyInputReturnsEmpty {

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
        public void doFormatEmptyInputReturnsEmpty() throws Exception {
            String input = "";
            LineEnding ending = CssFormatter.LineEnding.LF;
            CssFormatter formatter = new CssFormatter();
            assertEquals("", formatter.format(input, ending));
        }

    }