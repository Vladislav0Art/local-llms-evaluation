package org.jsoup.nodes;

public class GeneratedIsBlank_EmptyTextNode_ReturnsTrue {

    @Test
    public void isBlank_EmptyTextNode_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}