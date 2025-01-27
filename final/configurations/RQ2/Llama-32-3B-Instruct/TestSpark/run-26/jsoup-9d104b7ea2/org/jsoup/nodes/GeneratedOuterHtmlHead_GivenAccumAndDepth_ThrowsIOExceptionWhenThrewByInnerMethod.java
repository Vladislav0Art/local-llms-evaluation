package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_GivenAccumAndDepth_ThrowsIOExceptionWhenThrewByInnerMethod {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String nodeName() {
        return "text";
    }

    public String getWholeText() {
        return text;
    }

    public static String normalizeWhitespace(String str) {
        return StringUtil.normalizeWhitespace(str);
    }

    public static TextNode createFromEncoded(String encodedText) {
        // implementation
        return new TextNode(encodedText);
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
        return new TextNode(text);
    }
}

public class GeneratedTest {

    @Test
    public void outerHtmlHead_GivenAccumAndDepth_ThrowsIOExceptionWhenThrewByInnerMethod() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("text");
        assertThrows(IOException.class, () -> textNode.outerHtmlHead(accum, 1, out));
    }

}