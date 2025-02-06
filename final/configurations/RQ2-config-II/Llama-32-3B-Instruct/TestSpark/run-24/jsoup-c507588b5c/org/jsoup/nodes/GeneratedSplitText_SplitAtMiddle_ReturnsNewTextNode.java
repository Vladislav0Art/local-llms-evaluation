package org.jsoup.nodes;

public class GeneratedSplitText_SplitAtMiddle_ReturnsNewTextNode {

    @Test
    public void splitText_SplitAtMiddle_ReturnsNewTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(4);
        assertNotNull(result);
        assertTrue(!result.text().equals(textNode.text()));
    }

}