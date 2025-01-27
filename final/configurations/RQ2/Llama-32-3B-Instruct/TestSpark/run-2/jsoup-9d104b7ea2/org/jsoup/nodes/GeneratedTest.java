package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public TextNode() {
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void splitText(int offset) {
        // implementation
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TextNode) {
            return this.getText().equals(((TextNode) obj).getText());
        }
        return false;
    }

    @Override
    public String toString() {
        return text;
    }

    public static TextNode createFromEncoded(String encodedText) throws IOException {
        // implementation
        return new TextNode();
    }

    public TextNode clone() {
        return new TextNode(this.text);
    }
}

public class GeneratedTest {

    @Test
    public void createTextNode_GivenEmptyString_ReturnsEmptyTextNode() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

    @Test
    public void createTextNode_GivenNonEmptyString_ReturnsTextNodeWithText() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("Hello, World!", textNode.text());
    }

    @Test
    public void text_GivenTextNode_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals(textNode, textNode.text());
    }

    @Test
    public void nodeName_GivenTextNode_ReturnsTextNodeName() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void getWholeText_GivenTextNode_ReturnsWholeText() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("Hello, World!", textNode.getWholeText());
    }

    @Test
    public void clone_GivenTextNode_ReturnsNewTextNodeWithSameText() {
        TextNode originalTextNode = new TextNode("Hello, World!");
        TextNode clonedTextNode = originalTextNode.clone();
        assertEquals(originalTextNode, clonedTextNode);
    }

    @Test
    public void nodeName_GivenTextNode_ReturnsTextNodeName() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.nodeName());
    }

}