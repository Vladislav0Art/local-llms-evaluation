package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_GivenEncodedText_ReturnsTextNode {

    private String text;

    public TextNode(String text) {
    }

    public static String normalizeWhitespace(String str) {
        return str.replaceAll("\\s", " ");
    }

    public static TextNode createFromEncoded(String encodedText) {
        // implementation
        return new TextNode();
    }

    public void splitText(int offset) {
        // implementation
    }

    public String outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        // implementation
        return "";
    }

    public String outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        // implementation
        return "";
    }

    public TextNode clone() {
        // implementation
        return new TextNode();
    }
}

public class GeneratedTest {

    @Test
    public void createFromEncoded_GivenEncodedText_ReturnsTextNode() {
        String encodedText = "";
        assertThrows(NullPointerException.class, () -> TextNode.createFromEncoded(encodedText));
    }

}