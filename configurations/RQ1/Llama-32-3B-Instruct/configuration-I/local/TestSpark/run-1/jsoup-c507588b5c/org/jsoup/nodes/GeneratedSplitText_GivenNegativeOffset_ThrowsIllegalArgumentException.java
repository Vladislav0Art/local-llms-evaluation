package org.jsoup.nodes;

public class GeneratedSplitText_GivenNegativeOffset_ThrowsIllegalArgumentException {

    @Test
    public void SplitText_GivenNegativeOffset_ThrowsIllegalArgumentException() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(-1));
    }

}