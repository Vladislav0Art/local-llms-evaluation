package org.jsoup.nodes;

public class GeneratedText SetsTextNodeContent {

    public static void setParentNode(LeafNode parentNode) {
        GeneratedTest.parentNode = parentNode;
    }

    public static void setParentElement(Element parentElement) {
        GeneratedTest.parentElement = parentElement;
    }
}

public class GeneratedTest {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element parentElement;

    public NodeUtils setParentNode(LeafNode parentNode) {
        NodeUtils.nodeUtils.setParentNode(parentNode);
        this.parentNode = parentNode;
        return new NodeUtils();
    }

    public NodeUtils setParentElement(Element parentElement) {
        NodeUtils.nodeUtils.setParentElement(parentElement);
        this.parentElement = parentElement;
        return new NodeUtils();
    }
}

public class TextNodeTest {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element parentElement;

    public NodeUtils setParentNode(LeafNode parentNode) {
        GeneratedTest.nodeUtils.setParentNode(parentNode);
        this.parentNode = parentNode;
        return new NodeUtils();
    }

    public NodeUtils setParentElement(Element parentElement) {
        GeneratedTest.nodeUtils.setParentElement(parentElement);
        this.parentElement = parentElement;
        return new NodeUtils();
    }

    @Test
    public void text

    SetsTextNodeContent() {
        String text = "New Text";
        TextNode textNode = new TextNode();
        textNode.text(text);
        assertEquals(text, textNode.text());
    }

}