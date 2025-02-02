package org.jsoup.nodes;

public class Generated[TextNodeSplitting][AtOffset0]

Test {

    private TextNode textNode;

    @Test
    public void [TextNodeSplitting][AtOffset0]Test() {
        String originalText = "Hello, World!";
        int offset = 0;
        textNode = new TextNode(originalText);
        textNode = (TextNode) textNode.splitText(offset);
        assertEquals(originalText.substring(0, offset), ((TextNode) textNode).text());
    }

}