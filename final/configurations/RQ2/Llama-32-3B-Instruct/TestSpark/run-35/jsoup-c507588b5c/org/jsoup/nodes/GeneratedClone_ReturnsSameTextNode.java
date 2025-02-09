package org.jsoup.nodes;

public class GeneratedClone_ReturnsSameTextNode {

    @Test
    public void clone_ReturnsSameTextNode() {
        // Given:
        TextNode original = new TextNode("hello");
        TextNode expected = original;

        // When:
        TextNode result = original.clone();

        // Then:
        assertSame(expected, result);
    }

}