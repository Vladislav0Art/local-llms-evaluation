package org.jsoup.nodes;

public class GeneratedGetWholeText_ReturnsUnencodedText {

    private String text;

    public Node() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

class TextNode extends Node {
    public TextNode(String text) {
        super();
        setText(text);
    }
}

public class Document {
    private HtmlDocument htmlDocument;

    public void appendChild(Node node) {
    }

    public void write() throws IOException {
    }
}

class HtmlDocument extends LeafNode {
    public static final String TAG = "html";

    @Override
    public String tag() {
        return TAG;
    }

    public Appendable accumulateOutput(String value) {
        // implementation omitted
        return null;
    }
}

public class NodeTest {

    @Test
    public void getWholeText_ReturnsUnencodedText() {
        TextNode textNode = new TextNode("Hello World ");
        assertEquals("Hello World ", textNode.getWholeText());
    }

}