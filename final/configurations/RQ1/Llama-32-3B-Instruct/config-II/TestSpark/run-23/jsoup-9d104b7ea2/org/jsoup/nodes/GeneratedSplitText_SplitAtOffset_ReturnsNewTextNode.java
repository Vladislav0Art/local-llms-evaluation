package org.jsoup.nodes;

public class GeneratedSplitText_SplitAtOffset_ReturnsNewTextNode {

    @Test
    public void splitText_SplitAtOffset_ReturnsNewTextNode() throws IOException {
        String text = "Hello World!";
        int offset = 6;
        TextNode originalTextNode = new TextNode(text);
        TextNode newTextNode = originalTextNode.splitText(offset);
        assertEquals("World!", newTextNode.text());
    }

}