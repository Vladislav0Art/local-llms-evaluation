package org.jsoup.nodes;

public class GeneratedTestSplitTextAtOffsetTooFar {

    @Test
    public void testSplitTextAtOffsetTooFar() {
        // Arrange
        String text = "<p>This is a sample paragraph.</p>";
        int offset = 10;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertTrue(result.getSiblingIndex() == -1, "Expected one sibling node before the split.");
    }

}