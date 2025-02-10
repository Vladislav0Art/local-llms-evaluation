package org.jsoup.nodes;

public class GeneratedGetWholeText_WhenEmpty {

    @Test
    public void getWholeText_WhenEmpty() {
        TextNode node = new TextNode("");
        assertEquals("", node.getWholeText());
    }

}