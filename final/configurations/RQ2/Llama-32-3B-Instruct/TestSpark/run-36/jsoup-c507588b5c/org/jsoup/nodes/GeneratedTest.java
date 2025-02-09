package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void nodeName_AnonymousTextNode_ReturnsTagName() {
        TextNode node = new TextNode("");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void text_AnonymousTextNode_ReturnsOwnText() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

    @Test
    public void text_StringText_ReturnsStringText() {
        String text = "Hello";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

    @Test
    public void getWholeText_AnonymousTextNode_ReturnsOwnText() {
        TextNode node = new TextNode("");
        assertEquals("", node.getWholeText());
    }

    @Test
    public void isBlank_AnonymousTextNode_ReturnsTrue() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void splitText_AnonymousTextNode_ReturnsOldLength() {
        TextNode node = new TextNode("");
        assertEquals(0, node.splitText(0));
    }

    @Test
    public void toString_AnonymousTextNode_ReturnsTagName() {
        TextNode node = new TextNode("");
        assertEquals("text", node.toString());
    }

    @Test
    public void clone_AnnotatedTextNodes_ReturnSameInstance() throws Exception {
        TextNode node1 = new TextNode("Hello");
        TextNode node2 = node1.clone();
        assertTrue(node1.equals(node2));
    }

}