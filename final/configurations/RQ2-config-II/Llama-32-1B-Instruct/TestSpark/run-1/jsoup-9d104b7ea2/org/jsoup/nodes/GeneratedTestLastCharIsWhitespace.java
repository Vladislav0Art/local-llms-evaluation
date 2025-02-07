package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespace {

    private TextNode node;
    private Document document;

    @Test
    public void testLastCharIsWhitespace() {
        String text = "Hello";
        node = new TextNode(text);
        assertTrue(lastCharIsWhitespace(node.toString()));
    }

}