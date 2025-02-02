package org.jsoup.nodes;

public class GeneratedSplitText_PuttingCursorAtEndOfText_ReturnsSameTextNode {

    @Test
    public void splitText_PuttingCursorAtEndOfText_ReturnsSameTextNode() {
        String text = "Hello World";
        int offset = 10;
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(offset);
        assertEquals(textNode, result);
    }

}