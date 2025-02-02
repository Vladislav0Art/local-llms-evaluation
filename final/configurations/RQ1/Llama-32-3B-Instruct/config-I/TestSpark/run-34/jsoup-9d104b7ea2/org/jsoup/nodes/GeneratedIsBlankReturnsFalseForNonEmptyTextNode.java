package org.jsoup.nodes;

public class GeneratedIsBlankReturnsFalseForNonEmptyTextNode {

    @Test
    public void isBlankReturnsFalseForNonEmptyTextNode() {
        TextNode textNode = new TextNode("Hello");
        assertFalse(textNode.isBlank());
    }

}