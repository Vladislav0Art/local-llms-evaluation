package org.jsoup.nodes;

public class GeneratedSplitText_GivenNonNegativeOffset_ReturnsCorrectTextNode {

    @Test
    public void SplitText_GivenNonNegativeOffset_ReturnsCorrectTextNode() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        int offset = 6;
        TextNode newTextNode = textNode.splitText(offset);
        assertNotNull(newTextNode);
        assertEquals(rawText.substring(0, offset), newTextNode.getWholeText());
    }

}