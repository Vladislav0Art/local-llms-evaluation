package org.jsoup.nodes;

public class GeneratedToString_returns_text_node_string {

    @Test
    public void toString_returns_text_node_string() {
        TextNode node = new TextNode("Hello World");
        String expected = "text_node";
        assertEquals(expected, node.toString());
        assertEquals(expected, node.toString(""));
    }

}