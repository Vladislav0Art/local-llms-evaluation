package org.jsoup.nodes;

public class GeneratedNewNodeTextIsBlankWhenEmptyStringIsPassed {

    @Test
    public void newNodeTextIsBlankWhenEmptyStringIsPassed() {
        String blankText = "";
        TextNode textNode = new TextNode(blankText);
        assertTrue(textNode.isBlank());
    }

}