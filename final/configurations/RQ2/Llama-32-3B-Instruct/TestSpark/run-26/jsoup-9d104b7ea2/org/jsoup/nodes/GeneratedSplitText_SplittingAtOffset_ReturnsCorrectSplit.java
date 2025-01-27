package org.jsoup.nodes;

public class GeneratedSplitText_SplittingAtOffset_ReturnsCorrectSplit {

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
    public void splitText_SplittingAtOffset_ReturnsCorrectSplit() {
        // implementation
    }

}