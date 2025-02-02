package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextNodeSplitAtOffsetBeyondLength {

    @Test
    public void testTextNodeSplitAtOffsetBeyondLength() {
        String input = "abcdefg";
        TextNode textNode = new TextNode(input);
        StringBuilder expectedOutput = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i == 0 || input.charAt(i) != '\0') {
                expectedOutput.append(' ');
                expectedOutput.append(input.charAt(i));
            }
        }
        assertEquals(expectedOutput.toString(), textNode.splitText(7));
    }

    public static class TextNode {
        private String content;

        public TextNode(String content) {
            this.content = content;
        }

        public String toString() {
            return "{\"text\": \"" + content + "\", \"length\": " + content.length() + "}";
        }

        public StringBuilder splitText(int offset) {
            if (offset < 0 || offset > content.length()) {
                return new StringBuilder();
            }
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < offset; i++) {
                output.append(' ');
                output.append(content.charAt(i));
            }
            return output;
        }
    }

}