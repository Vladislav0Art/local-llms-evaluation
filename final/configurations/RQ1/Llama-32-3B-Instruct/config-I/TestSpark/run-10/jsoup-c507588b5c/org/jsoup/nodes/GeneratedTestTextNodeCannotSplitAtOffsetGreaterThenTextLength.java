package org.jsoup.nodes;

public class GeneratedTestTextNodeCannotSplitAtOffsetGreaterThenTextLength {

    @Test
    public void testTextNodeCannotSplitAtOffsetGreaterThenTextLength() {
        String input = "abcdefg";
        StringBuilder expectedOutput = new StringBuilder("abcdefg");
        for (int i = 0; i < input.length(); i++) {
            if (i == 6) {
                expectedOutput.append(' ');
            }
            expectedOutput.append(input.charAt(i));
        }
        assertEquals(expectedOutput.toString(), new TextNode(input).splitText(7));
    }

    public static class TextNode {
        private String text;

        public TextNode(String text) {
            this.text = text;
        }

        public String toString() {
            return "{\"text\": \"" + text + "\", \"length\": " + text.length() + "}";
        }

        public StringBuilder splitText(int offset) {
            if (offset < 0 || offset >= text.length()) {
                throw new IllegalArgumentException("Offset is out of range");
            }
            StringBuilder result = new StringBuilder();
            for (int i = 0; i <= offset; i++) {
                result.append(text.charAt(i));
            }
            return result;
        }
    }

}