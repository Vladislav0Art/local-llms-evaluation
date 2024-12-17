package org.jsoup.nodes;

public class GeneratedIsBlankReturnsFalseForNonEmptyTextNode {

    @Test
    public void isBlankReturnsFalseForNonEmptyTextNode() {
        // given
        TextNode textNode = new TextNode("test");

        // when
        boolean isBlank = textNode.isBlank();

        // then
        assertFalse(isBlank);
    }

}