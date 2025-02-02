package org.jsoup.nodes;

public class GeneratedCreateTextNode_ValidText_ReturnsTextNode {

    private Document parentNode;
    private Document document;

    @Test
    public void createTextNode_ValidText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertEquals("Hello World", textNode.text());
    }

}