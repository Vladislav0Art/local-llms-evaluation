package org.jsoup.nodes;

public class GeneratedSplitText_SplitAtOffset_LessThanLength_ReturnsNewTextNode {

    @Test
    public void splitText_SplitAtOffset_LessThanLength_ReturnsNewTextNode() throws IOException {
        String text = "Hello World!";
        int offset = 7;
        TextNode originalTextNode = new TextNode(text);
        TextNode newTextNode = originalTextNode.splitText(offset);
        assertEquals("World!", newTextNode.text());
    }

}