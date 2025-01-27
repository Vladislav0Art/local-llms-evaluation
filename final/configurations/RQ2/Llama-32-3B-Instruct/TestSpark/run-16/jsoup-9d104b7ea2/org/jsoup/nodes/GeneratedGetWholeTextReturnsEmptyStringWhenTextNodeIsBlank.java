package org.jsoup.nodes;

public class GeneratedGetWholeTextReturnsEmptyStringWhenTextNodeIsBlank {

    @Test
    public void getWholeTextReturnsEmptyStringWhenTextNodeIsBlank() {
        String blankText = "";
        TextNode textNode = new TextNode(blankText);
        assertEquals(blankText, textNode.getWholeText());
    }

}