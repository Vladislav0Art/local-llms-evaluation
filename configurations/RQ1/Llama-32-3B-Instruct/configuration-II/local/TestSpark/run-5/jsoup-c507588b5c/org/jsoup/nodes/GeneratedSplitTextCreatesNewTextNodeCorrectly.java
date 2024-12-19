package org.jsoup.nodes;

public class GeneratedSplitTextCreatesNewTextNodeCorrectly {

    @Test
    public void splitTextCreatesNewTextNodeCorrectly() throws IOException {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        int offset = 6;
        TextNode tailNode = node.splitText(offset);
        assertEquals("World!", tailNode.text());
    }

}