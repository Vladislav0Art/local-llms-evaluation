package org.jsoup.nodes;

public class GeneratedTestSplitTextAtOffsetZeroAfterLastSibling {

    @Test
    public void testSplitTextAtOffsetZeroAfterLastSibling() {
        // Arrange
        String text = "<p>This is a sample paragraph.</p>";
        int offset = 5;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertEquals(1, result.getSiblingIndex(), "Expected one sibling node after the split.");
    }

}