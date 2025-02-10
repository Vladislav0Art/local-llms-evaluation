package org.jsoup.nodes;

public class GeneratedTestSplitTextAtOffsetZero {

    @Test
    public void testSplitTextAtOffsetZero() {
        // Arrange
        String text = "<p>This is a sample paragraph.</p>";
        int offset = 0;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertEquals(1, result.getSiblingIndex(), "Expected one sibling node after the split.");
    }

}