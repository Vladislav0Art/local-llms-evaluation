package org.jsoup.nodes;

public class GeneratedIsBlank_GivenEmptyOrOnlyWhitespaceTextNode_ReturnsTrue {

    @Test
    public void isBlank_GivenEmptyOrOnlyWhitespaceTextNode_ReturnsTrue() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}