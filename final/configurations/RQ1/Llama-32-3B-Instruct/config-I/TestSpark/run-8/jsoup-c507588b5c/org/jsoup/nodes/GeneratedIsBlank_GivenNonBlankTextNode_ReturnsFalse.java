package org.jsoup.nodes;

public class GeneratedIsBlank_GivenNonBlankTextNode_ReturnsFalse {

    @Test
    public void isBlank_GivenNonBlankTextNode_ReturnsFalse() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }

}