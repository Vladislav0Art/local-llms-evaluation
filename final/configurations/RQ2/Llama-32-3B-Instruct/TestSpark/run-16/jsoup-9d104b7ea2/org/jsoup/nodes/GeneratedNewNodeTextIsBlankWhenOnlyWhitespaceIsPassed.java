package org.jsoup.nodes;

public class GeneratedNewNodeTextIsBlankWhenOnlyWhitespaceIsPassed {

    @Test
    public void newNodeTextIsBlankWhenOnlyWhitespaceIsPassed() {
        String blankText = "   ";
        TextNode textNode = new TextNode(blankText);
        assertTrue(textNode.isBlank());
    }

}