package org.jsoup.nodes;

public class GeneratedSplitText_GivenTextNodeWithOffset_ReturnsNewTextNode {

    @Test
    public void splitText_GivenTextNodeWithOffset_ReturnsNewTextNode() throws IOException {
        TextNode textNode = new TextNode("text with offset");
        TextNode newTextNode = textNode.splitText(3);
        assertEquals(4, newTextNode.getWholeText().length());
    }

}