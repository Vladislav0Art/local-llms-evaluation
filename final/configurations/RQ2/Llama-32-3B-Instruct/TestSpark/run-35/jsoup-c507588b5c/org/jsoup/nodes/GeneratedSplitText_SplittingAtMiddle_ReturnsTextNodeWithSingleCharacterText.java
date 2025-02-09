package org.jsoup.nodes;

public class GeneratedSplitText_SplittingAtMiddle_ReturnsTextNodeWithSingleCharacterText {

    @Test
    public void splitText_SplittingAtMiddle_ReturnsTextNodeWithSingleCharacterText() {
        // Given:
        TextNode node = new TextNode("hello");
        int offset = 5;

        // When:
        TextNode result = node.splitText(offset);

        // Then:
        assertEquals(1, result.text().length());
    }

}