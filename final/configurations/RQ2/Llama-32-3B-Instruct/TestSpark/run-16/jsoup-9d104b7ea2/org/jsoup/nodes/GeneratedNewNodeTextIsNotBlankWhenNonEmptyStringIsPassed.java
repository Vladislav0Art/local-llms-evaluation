package org.jsoup.nodes;

public class GeneratedNewNodeTextIsNotBlankWhenNonEmptyStringIsPassed {

    @Test
    public void newNodeTextIsNotBlankWhenNonEmptyStringIsPassed() {
        String nonBlankText = "Hello";
        TextNode textNode = new TextNode(nonBlankText);
        assertFalse(textNode.isBlank());
    }

}