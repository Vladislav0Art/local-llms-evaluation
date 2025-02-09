package org.jsoup.nodes;

public class GeneratedSplitText_SplittingAtEnd_ReturnsTextNodeWithSingleCharacterText {

    @Test
    public void splitText_SplittingAtEnd_ReturnsTextNodeWithSingleCharacterText() {
        // Given:
        TextNode node = new TextNode("hello");
        int offset = 6;

        // When:
        TextNode result = node.splitText(offset);

        // Then:
        assertEquals(1, result.text().length());
    }

}