package org.jsoup.nodes;

public class GeneratedIsBlankReturnsTrueForEmptyTextNode {

    @Test
    public void isBlankReturnsTrueForEmptyTextNode() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}