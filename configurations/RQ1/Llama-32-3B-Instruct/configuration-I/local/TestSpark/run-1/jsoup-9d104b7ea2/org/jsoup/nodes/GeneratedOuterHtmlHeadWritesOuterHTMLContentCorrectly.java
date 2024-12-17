package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadWritesOuterHTMLContentCorrectly {

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
    public void outerHtmlHeadWritesOuterHTMLContentCorrectly() throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Document document = new Document(new HtmlDocument(), output);
        TextNode textNode = new TextNode("   ");
        document.appendChild(textNode);
        document.write();
        assertEquals("<span>   </span>", output.toString());
    }

}