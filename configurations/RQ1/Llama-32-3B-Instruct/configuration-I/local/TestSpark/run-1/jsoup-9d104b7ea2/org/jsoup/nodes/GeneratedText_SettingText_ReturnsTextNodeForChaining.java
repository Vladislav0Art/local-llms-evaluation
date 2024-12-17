package org.jsoup.nodes;

public class GeneratedText_SettingText_ReturnsTextNodeForChaining {

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
    public void text_SettingText_ReturnsTextNodeForChaining() {
        TextNode textNode = new TextNode();
        textNode.setText("test");
        textNode.setText("new test");
        assertEquals("new test", textNode.getText());
    }

}