package org.jsoup.nodes;

public class GeneratedSplitTextReturnsTextNodeWithCorrectText {

    @Test
    public void splitTextReturnsTextNodeWithCorrectText() throws IOException {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        int offset = 6;
        TextNode tailNode = node.splitText(offset);
        assertEquals(node.nodeName(), tailNode.nodeName());
    }

}