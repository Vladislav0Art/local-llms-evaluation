package org.jsoup.nodes;

public class GeneratedIsBlankTextNodeIsBlank {

    @Test
    public void isBlankTextNodeIsBlank() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

}