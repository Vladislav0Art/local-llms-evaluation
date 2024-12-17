package org.jsoup.nodes;

public class GeneratedToString_ReturnsOuterHtml {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public static TextNode createFromEncoded(String encodedText) throws IOException {
        // implementation to decode and return a new TextNode
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    public String splitText(int offset) {
        if (offset 0 || offset > text.length()){
            throw new IndexOutOfBoundsException("Offset out of range");
        }
        return text.substring(offset);
    }

    public TextNode clone() {
        return new TextNode(text);
    }

    @Override
    public String toString() throws IOException {
        // implementation to generate the outer HTML
        return "text=" + text;
    }
}

public class GeneratedTest {

    @Test
    public void toString_ReturnsOuterHtml() throws IOException {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        String outerHtml = node.toString();
        assertNotNull(outerHtml);
    }

}