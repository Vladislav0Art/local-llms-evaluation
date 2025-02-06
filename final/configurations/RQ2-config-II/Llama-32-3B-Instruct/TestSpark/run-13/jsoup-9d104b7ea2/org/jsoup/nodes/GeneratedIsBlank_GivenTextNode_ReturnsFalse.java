package org.jsoup.nodes;

public class GeneratedIsBlank_GivenTextNode_ReturnsFalse {

    @Test
    public void isBlank_GivenTextNode_ReturnsFalse() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

}