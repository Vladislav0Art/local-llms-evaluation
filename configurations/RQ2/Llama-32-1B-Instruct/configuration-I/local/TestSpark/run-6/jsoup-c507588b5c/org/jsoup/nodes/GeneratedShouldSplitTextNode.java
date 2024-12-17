package org.jsoup.nodes;

public class GeneratedShouldSplitTextNode {

    @Test
    public void shouldSplitTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode splitTextNode = textNode.splitText(7);
        assertEquals("Hello World", splitTextNode.text());
        assertEquals(" ", splitTextNode.getWholeText().substring(6));
    }

}