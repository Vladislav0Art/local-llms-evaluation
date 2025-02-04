package org.jsoup.nodes;

public class GeneratedSplitTextHandlesNegativeOffset {

    @Test
    public void splitTextHandlesNegativeOffset() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(-1);
        assertNotNull(result);
        assertEquals("", result.text());
    }

}