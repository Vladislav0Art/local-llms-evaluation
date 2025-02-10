package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testIsBlank() {
        // Arrange
        String text = "   Hello World!   ";

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertTrue(result, "Expected true if the document is empty or only whitespace.");
    }

    @Test
    public void testIsBlankEmptyString() {
        // Arrange
        String text = "";

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertTrue(result, "Expected true if the document is empty or only whitespace.");
    }

    @Test
    public void testIsBlankWhitespaceOnlyString() {
        // Arrange
        String text = "Hello ";

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertTrue(result, "Expected true if the document is empty or only whitespace.");
    }

    @Test
    public void testIsBlankNoWhitespace() {
        // Arrange
        String text = "This is a sample string.";

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertFalse(result, "Expected false if the document contains any text content.");
    }

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

    @Test
    public void testGetWholeText() {
        // Arrange
        String text = "<p>This is a sample paragraph.</p>";

        // Act
        String result = TextNode.getText();

        // Assert
        assertEquals(text, result, "Expected the original text content.");
    }

    @Test
    public void testGetWholeTextBlank() {
        // Arrange
        String text = "";

        // Act
        String result = TextNode.getWholeText();

        // Assert
        assertEquals(text, result, "Expected the entire text to match the blank string.");
    }

    @Test
    public void testToString() {
        // Act
        String result = TextNode.toString();

        // Assert
        assertTrue(result.contains("<p>"), "Expected a paragraph-like output.");
    }

}