package org.jsoup.nodes;

public class GeneratedTest {

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
    public void createTextNode_GivenTextReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
    }

    @Test
    public void nodeName_ReturnsCorrectString() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_GivenTextReturnsUnencodedText() {
        TextNode textNode = new TextNode("Hello World ");
        assertEquals("Hello World ", textNode.getText());
    }

    @Test
    public void text_SettingText_ReturnsTextNodeForChaining() {
        TextNode textNode = new TextNode();
        textNode.setText("test");
        textNode.setText("new test");
        assertEquals("new test", textNode.getText());
    }

    @Test
    public void getWholeText_ReturnsUnencodedText() {
        TextNode textNode = new TextNode("Hello World ");
        assertEquals("Hello World ", textNode.getWholeText());
    }

    @Test
    public void isBlank_GivenEmptyStringReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_GivenWhitespaceOnlyReturnsTrue() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitText_SplitsTextNodeAtGivenOffset() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(6);
        assertEquals("Hello", result.getText());
        assertNotNull(result.getNode());
    }

    @Test
    public void outerHtmlHeadWritesOuterHTMLContentCorrectly() throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Document document = new Document(new HtmlDocument(), output);
        TextNode textNode = new TextNode("   ");
        document.appendChild(textNode);
        document.write();
        assertEquals("<span>   </span>", output.toString());
    }

    @Test
    public void outerHtmlHeadWritesOuterHTMLContentWithTrimmingCorrectly() throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Document document = new Document(new HtmlDocument(), output);
        TextNode textNode = new TextNode("   ");
        document.appendChild(textNode);
        document.write();
        assertEquals("<span> </span>", output.toString());
    }

    @Test
    public void clone_ReturnsDeepCopy() {
        TextNode original = new TextNode("Hello World");
        TextNode copy = original.clone();
        assertNotSame(original, copy);
        assertEquals(original.getText(), copy.getText());
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