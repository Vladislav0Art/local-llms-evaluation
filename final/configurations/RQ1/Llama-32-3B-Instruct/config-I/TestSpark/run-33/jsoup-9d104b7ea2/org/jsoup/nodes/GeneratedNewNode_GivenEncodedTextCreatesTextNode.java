package org.jsoup.nodes;

public class GeneratedNewNode_GivenEncodedTextCreatesTextNode {

    public static void setParentNode(LeafNode parentNode) {
        GeneratedTest.parentNode = parentNode;
    }

    public static void setParentElement(Element parentElement) {
        GeneratedTest.parentElement = parentElement;
    }
}

public class TextNode {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public static TextNode fromEncoded(String encodedText) {
        // implementation
        return new TextNode(encodedText);
    }

    public void setText(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }

    public int length() {
        return text.length();
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    public String getWholeText() {
        return text;
    }

    public TextNode splitText(int offset) {
        // implementation
        return new TextNode(text.substring(0, offset));
    }
}

public class GeneratedTest {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element parentElement;

    public static void setParentNode(LeafNode parentNode) {
        NodeUtils.setParents(parentNode);
    }

    public static void setParentElement(Element parentElement) {
        NodeUtils.setParents(parentElement);
    }

    public static NodeUtils setParents(LeafNode parentNode, Element parentElement) {
        GeneratedTest.nodeUtils.setParentNode(parentNode);
        this.parentNode = parentNode;
        if (parentElement != null) {
            GeneratedTest.nodeUtils.setParentElement(parentElement);
            this.parentElement = parentElement;
        }
        return new NodeUtils();
    }

    @Test
    public void newNode_GivenEncodedTextCreatesTextNode() {
        String encodedText = "Hello World";
        TextNode textNode = TextNode.fromEncoded(encodedText);
        assertNotNull(textNode);
    }

}