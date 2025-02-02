package org.jsoup.nodes;

public class GeneratedSplitText_SplitsAtEndIfOffsetIsGreaterThanOrEqualLength {

    @Test
    public void splitText_SplitsAtEndIfOffsetIsGreaterThanOrEqualLength() {
        String rawText = "Hello World!";
        int offset = 10;
        TextNode textNode = new TextNode(rawText);
        TextNode tailNode = textNode.splitText(offset);
        assertEquals("", tailNode.text());
        assertEquals("Hello World!", textNode.text());
    }

}