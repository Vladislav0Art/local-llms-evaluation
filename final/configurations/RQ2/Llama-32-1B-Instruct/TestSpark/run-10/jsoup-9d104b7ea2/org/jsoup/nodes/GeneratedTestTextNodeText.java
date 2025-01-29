package org.jsoup.nodes;

public class GeneratedTestTextNodeText {

    @Test
    public void testTextNodeText() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

}