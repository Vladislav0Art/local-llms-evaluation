package org.jsoup.nodes;

public class GeneratedText_nodeWholeText_returnsUnencodedText_withSpaces_and_newlines_test {

    // LeafNode implementation...
}

public class TextNode {
    private String text;
    private LeafNode parentNode;

    public TextNode(String text) {
        this.text = text;
    }

    public String nodeName() {
        return "#text";
    }

    public boolean isBlank() {
        return text.trim().isEmpty();
    }

    public String text() {
        return text;
    }

    public void setText(String newText) {
        text = newText;
    }

    public TextNode splitText(int offset) throws IOException {
        // Split text implementation...
        return null;
    }

    public void outerHtmlHead(Appendable accum, int indent, Document.OutputSettings out) throws IOException {
        if (indent > 0) {
            accum.appendln();
        }
    }

    public void outerHtmlTail(Appendable accum, int indent, Document.OutputSettings out) throws IOException {
        // No indentation here...
    }

    @Override
    public String toString() {
        return "<p>" + text + "</p>";
    }
}

public class GeneratedTest {

    private TextNode parentNode;

    @Mock
    public LeafNode getMockLeafNode() {
        return new LeafNode();
    }

    @Before
    public void setup() throws IOException {
        parentNode = new TextNode("");
    }

    @Test
    public void text_nodeWholeText_returnsUnencodedText_withSpaces_and_newlines_test() {
        String text = "Hello,\nWorld!";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello,\nWorld!", textNode.getWholeText()); // Fix the method name here
    }

}