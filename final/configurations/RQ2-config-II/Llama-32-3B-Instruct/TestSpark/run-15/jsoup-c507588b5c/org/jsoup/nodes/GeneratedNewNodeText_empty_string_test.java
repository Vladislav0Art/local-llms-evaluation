package org.jsoup.nodes;

public class GeneratedNewNodeText_empty_string_test {

    @Test
    public void newNodeText_empty_string_test() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
        assertEquals("", node.text());
    }

}