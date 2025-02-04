package org.jsoup.nodes;

public class GeneratedSplitTextCreatesNewTextNodeWithProperOffset {

    @Test
    public void splitTextCreatesNewTextNodeWithProperOffset() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        TextNode tailNode = textNode.splitText(6);
        assertEquals("World", tailNode.text());
        assertTrue(tailNode.isBlank());
    }

}