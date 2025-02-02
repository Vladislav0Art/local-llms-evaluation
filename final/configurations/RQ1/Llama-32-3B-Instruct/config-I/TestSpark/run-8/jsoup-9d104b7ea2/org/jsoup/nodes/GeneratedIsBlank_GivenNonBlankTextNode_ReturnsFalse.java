package org.jsoup.nodes;

public class GeneratedIsBlank_GivenNonBlankTextNode_ReturnsFalse {

    @Test
    public void isBlank_GivenNonBlankTextNode_ReturnsFalse() {
        TextNode textNode = new TextNode("non blank text");
        assertFalse(textNode.isBlank());
    }

}