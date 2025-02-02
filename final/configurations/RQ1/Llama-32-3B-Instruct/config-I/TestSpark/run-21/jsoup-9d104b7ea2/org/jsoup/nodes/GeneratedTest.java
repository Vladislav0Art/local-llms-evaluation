package org.jsoup.nodes;

public class GeneratedTest {

    private Document parentNode;
    private Document document;

    @Test
    public void createTextNode_ValidText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void createTextNode_BlankText_ReturnsTextNode() {
        TextNode textNode = new TextNode("");
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertEquals("", textNode.text());
    }

    @Test
    public void splitText_ValidOffset_SplitsTextNodeCorrectly() {
        parentNode = document;
        TextNode textNode = new TextNode("Hello World");
        textNode.parentNode = parentNode;
        TextNode tailNode = textNode.splitText(7);
        assertEquals("Hello ", textNode.text());
        assertNotNull(tailNode);
        assertEquals("World", tailNode.text());
    }

    @Test
    public void splitText_InvalidOffset_ThrowsAssertionError() {
        parentNode = document;
        TextNode textNode = new TextNode("Hello World");
        textNode.parentNode = parentNode;
        assertThrows(AssertionError.class, () -> textNode.splitText(-1));
    }

    @Test
    public void text_GetWholeText_ReturnsUnencodedText() {
        parentNode = document;
        TextNode textNode = new TextNode("Hello World");
        textNode.parentNode = parentNode;
        assertEquals("Hello World", textNode.getWholeText());
    }

    @Test
    public void isBlank_TextIsBlank_ReturnsTrue() {
        parentNode = document;
        TextNode textNode = new TextNode("");
        textNode.parentNode = parentNode;
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_TextIsNotBlank_ReturnsFalse() {
        parentNode = document;
        TextNode textNode = new TextNode("Hello World");
        textNode.parentNode = parentNode;
        assertFalse(textNode.isBlank());
    }

}