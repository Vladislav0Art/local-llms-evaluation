package org.jsoup.nodes;

public class GeneratedSplitTextReturnsEmptyStringWhenOffsetIsZero {

    @Test
    public void splitTextReturnsEmptyStringWhenOffsetIsZero() {
        String originalText = "Hello";
        TextNode textNode = new TextNode(originalText);
        assertEquals("", textNode.splitText(0));
    }

}