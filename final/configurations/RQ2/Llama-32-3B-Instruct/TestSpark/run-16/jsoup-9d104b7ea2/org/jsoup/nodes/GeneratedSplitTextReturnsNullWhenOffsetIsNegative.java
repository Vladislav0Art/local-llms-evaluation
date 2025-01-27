package org.jsoup.nodes;

public class GeneratedSplitTextReturnsNullWhenOffsetIsNegative {

    @Test
    public void splitTextReturnsNullWhenOffsetIsNegative() {
        String originalText = "Hello";
        TextNode textNode = new TextNode(originalText);
        assertNull(textNode.splitText(-1));
    }

}