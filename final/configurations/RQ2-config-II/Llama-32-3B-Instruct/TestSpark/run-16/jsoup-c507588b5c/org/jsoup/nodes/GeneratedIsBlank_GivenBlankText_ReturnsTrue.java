package org.jsoup.nodes;

public class GeneratedIsBlank_GivenBlankText_ReturnsTrue {

    @Test
    public void isBlank_GivenBlankText_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}