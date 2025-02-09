package org.jsoup.nodes;

public class GeneratedNodeName_EmptyText_ReturnsEmptyString {

    @Test
    public void nodeName_EmptyText_ReturnsEmptyString() {
        // Given:
        TextNode node = new TextNode("");

        // When:
        String result = node.nodeName();

        // Then:
        assertEquals("", result);
    }

}