package org.jsoup.nodes;

public class GeneratedSplitText_SplitAtBeginning_ReturnsSameTextNode {

    @Test
    public void splitText_SplitAtBeginning_ReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(0);
        assertEquals(textNode, result);
    }

}