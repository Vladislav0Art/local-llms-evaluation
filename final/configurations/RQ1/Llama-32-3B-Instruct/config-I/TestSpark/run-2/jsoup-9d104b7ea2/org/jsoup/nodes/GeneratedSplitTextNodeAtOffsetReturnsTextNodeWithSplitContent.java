package org.jsoup.nodes;

public class GeneratedSplitTextNodeAtOffsetReturnsTextNodeWithSplitContent {

    @Test
    public void splitTextNodeAtOffsetReturnsTextNodeWithSplitContent() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        int offset = 7;
        TextNode result = textNode.splitText(offset);
        assertNotNull(result);
        assertEquals("Hello", result.text());
    }

}