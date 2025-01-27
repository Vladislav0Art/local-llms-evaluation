package org.jsoup.nodes;

public class GeneratedGetWholeTextReturnsOriginalTextWhenNonBlankTextNodeIsPassed {

    @Test
    public void getWholeTextReturnsOriginalTextWhenNonBlankTextNodeIsPassed() {
        String nonBlankText = "Hello";
        TextNode textNode = new TextNode(nonBlankText);
        assertEquals(nonBlankText, textNode.getWholeText());
    }

}