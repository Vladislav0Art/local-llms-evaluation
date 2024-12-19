package org.jsoup.nodes;

public class GeneratedTestMultipleNewlines {

    @Test
    public void testMultipleNewlines() {
        TextNode textNode = new TextNode("Hello\n\nWorld");
        assertFalse(textNode.text().contains("\n"));
    }

}