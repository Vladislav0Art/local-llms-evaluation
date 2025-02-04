package org.jsoup.nodes;

public class GeneratedCreateTextNode_SingleWord_ReturnsNewTextNode {

    @Test
    public void createTextNode_SingleWord_ReturnsNewTextNode() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.text());
    }

}