package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenRawText_ReturnsNewTextNode {

    @Test
    public void CreateTextNode_GivenRawText_ReturnsNewTextNode() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        assertNotNull(textNode);
        assertEquals(rawText, textNode.value());
    }

}