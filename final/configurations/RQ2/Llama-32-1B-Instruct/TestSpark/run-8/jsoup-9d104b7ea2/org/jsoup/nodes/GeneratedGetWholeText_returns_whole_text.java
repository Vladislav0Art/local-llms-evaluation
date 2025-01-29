package org.jsoup.nodes;

public class GeneratedGetWholeText_returns_whole_text {

    @Test
    public void getWholeText_returns_whole_text() {
        TextNode node = new TextNode("Hello World");
        String expected = "Hello World";
        assertEquals(expected, node.getWholeText());
    }

}