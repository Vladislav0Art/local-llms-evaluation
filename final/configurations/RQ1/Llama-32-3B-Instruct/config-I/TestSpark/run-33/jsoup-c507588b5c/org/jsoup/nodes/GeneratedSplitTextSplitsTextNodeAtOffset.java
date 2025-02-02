package org.jsoup.nodes;

public class GeneratedSplitTextSplitsTextNodeAtOffset {

    @Test
    public void splitTextSplitsTextNodeAtOffset() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode tailNode = node.splitText(5);
        assertEquals("World", tailNode.text());
    }

}