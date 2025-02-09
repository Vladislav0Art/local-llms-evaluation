package org.jsoup.nodes;

public class GeneratedSplitText_SplittingAtStart_ReturnsTextNodeWithEmptyText {

    @Test
    public void splitText_SplittingAtStart_ReturnsTextNodeWithEmptyText() {
        // Given:
        TextNode node = new TextNode("hello");
        int offset = 0;

        // When:
        TextNode result = node.splitText(offset);

        // Then:
        assertEquals(1, result.text().length());
    }

}