package org.jsoup.nodes;

public class GeneratedIsBlank_EmptyTextNode_ReturnsTrue {

    @Test
    public void isBlank_EmptyTextNode_ReturnsTrue() {
        // Given:
        TextNode node = new TextNode("");

        // When:
        boolean result = node.isBlank();

        // Then:
        assertTrue(result);
    }

}