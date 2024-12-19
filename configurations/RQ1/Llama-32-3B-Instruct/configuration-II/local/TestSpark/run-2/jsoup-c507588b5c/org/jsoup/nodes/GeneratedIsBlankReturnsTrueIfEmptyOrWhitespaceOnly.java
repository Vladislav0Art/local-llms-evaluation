package org.jsoup.nodes;

public class GeneratedIsBlankReturnsTrueIfEmptyOrWhitespaceOnly {

    private TextNode textNode;

    @Test
    public void isBlankReturnsTrueIfEmptyOrWhitespaceOnly() {
        textNode = new TextNode("");
        assertTrue(textNode.isBlank());

        textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

}