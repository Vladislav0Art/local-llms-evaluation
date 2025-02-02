package org.jsoup.nodes;

public class GeneratedSplitText_SplitsAtCorrectOffset {

    @Test
    public void splitText_SplitsAtCorrectOffset() {
        String rawText = "Hello World!";
        int offset = 5;
        TextNode textNode = new TextNode(rawText);
        TextNode tailNode = textNode.splitText(offset);
        assertEquals("World!", tailNode.text());
        assertEquals("Hello", textNode.text());
    }

}