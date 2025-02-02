package org.jsoup.nodes;

public class GeneratedSplitTextNodeAtOffsetThrowsExceptionWhenOffsetIsNegative {

    @Test
    public void splitTextNodeAtOffsetThrowsExceptionWhenOffsetIsNegative() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        int negativeOffset = -1;
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(negativeOffset));
    }

}