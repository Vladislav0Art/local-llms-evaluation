package org.jsoup.nodes;

public class GeneratedTextNodeShouldCreateTextNodeWithValidString {

    @Test
    public void textNodeShouldCreateTextNodeWithValidString() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.text());
        assertEquals("Hello World", textNode.text());
    }

}