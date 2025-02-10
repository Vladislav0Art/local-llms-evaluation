package org.jsoup.nodes;

public class GeneratedTestSplitTextAtOffsetNegative {

    @Test
    public void testSplitTextAtOffsetNegative() {
        // Arrange
        String text = "<p>This is a sample paragraph.</p>";
        int offset = -1;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertEquals(0, result.getSiblingIndex(), "Expected zero sibling index after the split.");
    }

}