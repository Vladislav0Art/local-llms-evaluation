package org.jsoup.nodes;

public class GeneratedTestMultipleLines {

    @Test
    public void testMultipleLines() {
        TextNode textNode = new TextNode("Hello\nWorld");
        assertTrue(textNode.text().contains("\n"));
    }

}