package org.jsoup.nodes;

public class GeneratedIsBlankTextNodeNotBlank {

    @Test
    public void isBlankTextNodeNotBlank() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}