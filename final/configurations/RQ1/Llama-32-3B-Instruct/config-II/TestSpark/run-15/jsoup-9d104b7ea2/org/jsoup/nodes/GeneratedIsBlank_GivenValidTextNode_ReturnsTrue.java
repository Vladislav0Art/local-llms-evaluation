package org.jsoup.nodes;

public class GeneratedIsBlank_GivenValidTextNode_ReturnsTrue {

    @Test
    public void isBlank_GivenValidTextNode_ReturnsTrue() {
        // given
        String text = "   ";

        // when
        TextNode textNode = new TextNode(text);
        boolean result = textNode.isBlank();

        // then
        assertTrue(result);
    }

}