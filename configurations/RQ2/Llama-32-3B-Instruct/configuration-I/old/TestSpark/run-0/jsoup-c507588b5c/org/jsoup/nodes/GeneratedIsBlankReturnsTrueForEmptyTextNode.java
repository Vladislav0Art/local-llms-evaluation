package org.jsoup.nodes;

public class GeneratedIsBlankReturnsTrueForEmptyTextNode {

    @Test
    public void isBlankReturnsTrueForEmptyTextNode() {
        // given
        TextNode textNode = new TextNode();

        // when
        boolean isBlank = textNode.isBlank();

        // then
        assertTrue(isBlank);
    }

}