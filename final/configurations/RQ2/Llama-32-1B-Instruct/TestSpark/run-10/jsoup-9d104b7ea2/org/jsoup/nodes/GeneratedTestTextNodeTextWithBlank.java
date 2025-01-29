package org.jsoup.nodes;

public class GeneratedTestTextNodeTextWithBlank {

    @Test
    public void testTextNodeTextWithBlank() {
        TextNode node = new TextNode("Hello ");
        assertEquals(" ", node.text());
    }

}