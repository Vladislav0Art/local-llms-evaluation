package org.jsoup.nodes;

public class GeneratedTestGetWholeText {

    private TextNode node;
    private Document document;

    @Test
    public void testGetWholeText() {
        String expected = "Hello, World!";
        node = new TextNode("Hello, World!");
        assertEquals(expected, node.getWholeText());
    }

}