package org.jsoup.nodes;

public class GeneratedIsBlank_NonEmptyTextNode_ReturnsFalse {

    @Test
    public void isBlank_NonEmptyTextNode_ReturnsFalse() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

}