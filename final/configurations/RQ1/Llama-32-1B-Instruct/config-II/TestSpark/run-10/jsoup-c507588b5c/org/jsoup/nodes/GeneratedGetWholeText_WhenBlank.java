package org.jsoup.nodes;

public class GeneratedGetWholeText_WhenBlank {

    @Test
    public void getWholeText_WhenBlank() {
        TextNode node = new TextNode("");
        assertEquals("", node.getWholeText());
    }

}