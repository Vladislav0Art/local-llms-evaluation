package org.jsoup.nodes;

public class Generated[TextNodeTrimming]

Test {

    private TextNode textNode;

    @Test
    public void [TextNodeTrimming]Test() {
        String originalText = "\n  \t";
        String trimmedText = "  ";
        textNode = new TextNode(originalText);
        textNode = (TextNode) textNode.trim();
        assertEquals(trimmedText, ((TextNode) textNode).text());
    }

}