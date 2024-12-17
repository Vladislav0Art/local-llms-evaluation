package org.jsoup.nodes;

public class GeneratedTestNotIsBlank {

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
    public void testNotIsBlank() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

}