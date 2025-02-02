package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() throws IOException {
        String text = "   Hello World!  ";
        TextNode node = new TextNode(text);
        TextNode splitNode = node.splitText(5);
        assertEquals("Hello World!", splitNode.text());
    }

}