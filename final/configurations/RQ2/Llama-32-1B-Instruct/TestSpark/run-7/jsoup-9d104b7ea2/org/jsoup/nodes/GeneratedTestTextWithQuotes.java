package org.jsoup.nodes;

public class GeneratedTestTextWithQuotes {

    @Test
    public void testTextWithQuotes() {
        TextNode textNode = new TextNode("\"Hello World\"");
        assertEquals("\"Hello World\"", textNode.text());
    }

}