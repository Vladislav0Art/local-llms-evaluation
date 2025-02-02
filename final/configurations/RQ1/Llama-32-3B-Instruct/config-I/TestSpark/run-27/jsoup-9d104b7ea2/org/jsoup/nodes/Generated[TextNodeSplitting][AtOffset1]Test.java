package org.jsoup.nodes;

public class Generated[TextNodeSplitting][AtOffset1]

Test {

    private TextNode textNode;

    @Test
    public void [TextNodeSplitting][AtOffset1]Test() {
        String originalText = "Hello, World!";
        int offset = 1;
        textNode = new TextNode(originalText);
        textNode = (TextNode) textNode.splitText(offset);
        assertEquals(originalText.substring(0, offset), ((TextNode) textNode).text());
    }

}