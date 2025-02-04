package org.jsoup.nodes;

public class GeneratedIsBlank_GivenEmptyString_ReturnsTrue {

    @Test
    public void isBlank_GivenEmptyString_ReturnsTrue() {
        // given
        String text = "";
        TextNode node = new TextNode(text);

        // when
        boolean result = node.isBlank();

        // then
        assertTrue(result);
    }

}