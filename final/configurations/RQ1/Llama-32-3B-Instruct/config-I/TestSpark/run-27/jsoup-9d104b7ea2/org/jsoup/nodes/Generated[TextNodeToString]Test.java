package org.jsoup.nodes;

public class Generated[TextNodeToString]

Test {

    private TextNode textNode;

    @Test
    public void [TextNodeToString]Test() {
        String originalText = "Hello, World!";
        textNode = new TextNode(originalText);
        assertEquals("Hello, World!", ((TextNode) textNode).toString());
    }

}