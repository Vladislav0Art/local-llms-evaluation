package org.jsoup.nodes;

public class GeneratedSplitTextHandlesOffsetGreater Than TextLength {

    @Test
    public void splitTextHandlesOffsetGreater

    Than TextLength() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(10);
        assertNotNull(result);
        assertEquals("", result.text());
    }

}