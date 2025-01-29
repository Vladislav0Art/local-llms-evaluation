package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestParseNoContent {

    @Test
    public void testParseNoContent() throws Exception {
        String input = "";
        String expected = "";
        Parser parser = new Parser();
        Node node = parser.parse(input);
        if (node instanceof Text) {
            ((Text) node).setText(expected);
        }
    }

    static class Parser {
        public Node parse(String string) {
            return new TestParser().parse(string);
        }
    }

    static class Text {
        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    static class CodeBlock {
        private String content;

        public CodeBlock(String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }

    static class TestParser extends Parser {

        @Override
        protected Node parse(String string) {
            // Split the input by newline
            String[] lines = string.split("\n");

            // Create a new CodeBlock and Text objects for each line
            StringBuilder code = new StringBuilder();
            StringBuilder text = new StringBuilder();

            for (String line : lines) {
                if (!line.trim().isEmpty()) {
                    // Add newline to the end of each line
                    if (code.length() > 0 && !code.toString().endsWith("\n")) {
                        code.append("\n");
                    }
                    if (text.length() > 0 && !text.toString().endsWith("\n")) {
                        text.append("\n");
                    }

                    // Add the line to the CodeBlock and Text
                    if (code.length() > 0) {
                        code.append(line).append("\n");
                    } else {
                        code = new StringBuilder(line);
                    }
                    if (text.length() > 0) {
                        text.append(line).append("\n");
                    } else {
                        text = new StringBuilder(line);
                    }
                }
            }

            // Return the CodeBlock and Text
            return new CodeBlock(code.toString()) {
                public String toString() {
                    return text.toString();
                }
            };
        }
    }

}