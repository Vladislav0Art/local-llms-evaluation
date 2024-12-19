package org.jsoup.nodes;

public class GeneratedTestSplitText {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public boolean isBlank() {
        return text.trim().isEmpty();
    }

    public void splitText(int offset) {
        // implementation to split the text at the given offset
    }

    public static TextNode createFromEncoded(String encodedText) {
        // implementation to create a new TextNode from an encoded string
        return null;
    }

    public String getWholeText() {
        return text;
    }

    public static String normaliseWhitespace(String text) {
        // implementation to normalize whitespace in the given text
        return "";
    }
}

public class GeneratedTest {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("Hello World");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(outContent);
        try {
            TextNode result = textNode.splitText(7);
            assertEquals("Hello", ((TextNode) result).text());
            assertEquals("World", textNode.splitText(13));
        } finally {
            System.setOut(originalOut);
        }
    }

}