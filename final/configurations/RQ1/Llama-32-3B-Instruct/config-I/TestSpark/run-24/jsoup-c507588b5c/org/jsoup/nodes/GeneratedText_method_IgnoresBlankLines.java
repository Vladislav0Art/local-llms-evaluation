package org.jsoup.nodes;

public class GeneratedText_method_IgnoresBlankLines {

    @Test
    public void text_method_IgnoresBlankLines() throws Exception {
        String text = "Hello\nWorld";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World", testIgnoresBlankLines(text, textNode));
    }

    private String testIgnoresBlankLines(String text, TextNode textNode) {
        StringBuilder result = new StringBuilder();
        boolean skipLine = false;
        for (char c : text.toCharArray()) {
            if (c == '\n') {
                if (!skipLine) {
                    result.append("\n");
                    skipLine = true;
                }
            } else {
                result.append(c);
                skipLine = false;
            }
        }
        return result.toString();
    }

}