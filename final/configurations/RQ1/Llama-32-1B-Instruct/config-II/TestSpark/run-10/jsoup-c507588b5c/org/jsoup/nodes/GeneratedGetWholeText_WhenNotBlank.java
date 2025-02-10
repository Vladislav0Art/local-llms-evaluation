package org.jsoup.nodes;

public class GeneratedGetWholeText_WhenNotBlank {

    @Test
    public void getWholeText_WhenNotBlank() {
        TextNode node = new TextNode("Hello");
        assertEquals(" Hello", node.getWholeText());
    }

}