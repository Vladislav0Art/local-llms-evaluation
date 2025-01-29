package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    private Appendable mockAppendable;
    private Document mockDocument;

    @Test
    public void testIsBlank() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

}