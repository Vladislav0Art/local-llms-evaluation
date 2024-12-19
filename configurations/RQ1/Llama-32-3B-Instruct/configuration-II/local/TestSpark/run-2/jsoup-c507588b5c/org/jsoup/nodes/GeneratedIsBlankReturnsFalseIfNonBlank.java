package org.jsoup.nodes;

public class GeneratedIsBlankReturnsFalseIfNonBlank {

    private TextNode textNode;

    @Test
    public void isBlankReturnsFalseIfNonBlank() {
        String originalText = "Hello World";
        textNode = new TextNode(originalText);
        assertFalse(textNode.isBlank());
    }

}