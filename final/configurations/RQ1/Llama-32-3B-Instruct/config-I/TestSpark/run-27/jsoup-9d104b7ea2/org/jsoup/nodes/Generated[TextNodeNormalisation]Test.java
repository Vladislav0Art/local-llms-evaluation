package org.jsoup.nodes;

public class Generated[TextNodeNormalisation]

Test {

    private TextNode textNode;

    @Test
    public void [TextNodeNormalisation]Test() {
        String text = "   ";
        textNode = new TextNode(text);
        assertEquals("   ", textNode.text());
    }

}