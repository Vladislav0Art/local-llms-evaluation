package org.jsoup.nodes;

public class GeneratedGetWholeText_GivenNonEmptyText_ReturnsCorrectText {

    @Test
    public void GetWholeText_GivenNonEmptyText_ReturnsCorrectText() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        assertEquals(rawText, textNode.getWholeText());
    }

}