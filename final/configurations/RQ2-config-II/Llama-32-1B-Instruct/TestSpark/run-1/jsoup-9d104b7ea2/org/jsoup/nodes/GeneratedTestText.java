package org.jsoup.nodes;

public class GeneratedTestText {

    private TextNode node;
    private Document document;

    @Test
    public void testText() {
        String expected = "Hello, World!";
        node = new TextNode("Hello, World!");
        assertEquals(expected, node.text());
    }

}