package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String nodeName() {
        return "#text";
    }

    public String text() {
        return text;
    }

    public boolean isBlank() {
        return isEmpty();
    }

    public boolean isEmpty() {
        return text == null || text.isEmpty();
    }
}

public class TextNodeTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
    }

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectName() throws IOException {
        TextNode textNode = new TextNode(" ");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_GivenTextNode_ReturnsUnencodedText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void text_GivenBlankTextNode_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

    @Test
    public void isBlank_GivenTextNode_ReturnsTrueIfTextIsBlank() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_GivenNonBlankTextNode_ReturnsFalse() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_GivenTextNodeAndOffset_SplitsCorrectly() throws IOException {
        String text = "Hello World";
        int offset = 6;
        TextNode textNode = new TextNode(text);
        TextNode splitTextNode = textNode.splitText(offset);
        assertEquals("World", splitTextNode.text());
    }

    @Test
    public void testTextNodeCreation() {
        // Arrange
        // No need to arrange as the creation is straightforward
        TextNode textNode = new TextNode("World");

        // Act
        assertNotNull(textNode);

        // Assert
        assertEquals("#text", textNode.nodeName());
        assertEquals("World", textNode.text());
    }

}