package org.jsoup.nodes;

public class GeneratedTest {

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
    public void newTextNode_GivenEmptyTextReturnsNewTextNode() {
        TextNode textNode = new TextNode("");
        assertNotNull(textNode);
    }

    @Test
    public void newTextNode_GivenNonBlankTextReturnsNewTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
    }

    @Test
    public void newNode_GivenEncodedTextCreatesTextNode() {
        String encodedText = "Hello World";
        TextNode textNode = TextNode.fromEncoded(encodedText);
        assertNotNull(textNode);
    }

    @Test
    public void splitText_DividedIntoTwoNodesAtOffsetReturnsNewTextNode() {
        String text = "Hello World";
        int offset = 5;
        TextNode tailNode = new TextNode(text).splitText(offset);
        assertNotNull(tailNode);
        assertEquals(5, tailNode.text().length());
    }

    @Test
    public void splitText_DividedIntoTwoNodesAtOffsetReturnsNewTextNodeWhenOffsetIsLastChar() {
        String text = "Hello World";
        int offset = text.length();
        TextNode tailNode = new TextNode(text).splitText(offset);
        assertNotNull(tailNode);
        assertEquals(0, tailNode.text().length());
    }

    @Test
    public void splitText_GivenNegativeOffsetReturnsBlankTextNode() {
        String text = "Hello World";
        int offset = -5;
        TextNode tailNode = new TextNode(text).splitText(offset);
        assertNotNull(tailNode);
        assertTrue(tailNode.isBlank());
    }

    @Test
    public void isBlank_ReturnsTrueWhenTextNodeIsBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_ReturnsFalseWhenTextNodeContainsText() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void getWholeText_RetrievesOriginalText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void text_SetsTextNodeContent() {
        String text = "New Text";
        TextNode textNode = new TextNode();
        textNode.text(text);
        assertEquals(text, textNode.text());
    }

}