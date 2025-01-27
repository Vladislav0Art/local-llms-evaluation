package org.jsoup.nodes;

public class GeneratedNodeName_GivenText_ReturnsText {

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
    public void nodeName_GivenText_ReturnsText() {
        TextNode textNode = new TextNode("text");
        assertEquals("", textNode.nodeName());
    }

}