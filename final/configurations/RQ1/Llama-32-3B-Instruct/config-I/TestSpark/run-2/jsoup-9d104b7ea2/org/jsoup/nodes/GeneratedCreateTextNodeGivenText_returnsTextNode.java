package org.jsoup.nodes;

public class GeneratedCreateTextNodeGivenText_returnsTextNode {

    @Test
    public void createTextNodeGivenText_returnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertEquals(text, textNode.text());
    }

}