package org.jsoup.nodes;

public class GeneratedCreateTextNode BlankText_ReturnsTextNode {

    private TextNode parentNode;
    private Document document;

    @Test
    public void createTextNode

    BlankText_ReturnsTextNode() {
        TextNode textNode = new TextNode("");
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertEquals("", textNode.text());
    }

}