package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void isBlank_EmptyText_ReturnsFalse() {
        // Arrange
        String encodedText = "";

        // Act
        boolean result = TextNode.isBlank(encodedText);

        // Assert
        assertTrue(result);
    }

    @Test
    public void isBlank_Whitespace_ReturnsTrue() {
        // Arrange
        String encodedText = "   ";

        // Act
        boolean result = TextNode.isBlank(encodedText);

        // Assert
        assertTrue(result);
    }

    @Test
    public void splitText_EmptyOffset_ReturnsNode() {
        // Arrange
        String encodedText = "";
        int offset = 0;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void splitText_SplittingAtZeroOffset_ReturnsNode() {
        // Arrange
        String encodedText = "";
        int offset = 0;
        Document doc = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void splitText_SplittingAtNegativeOffset_ReturnsNode() {
        // Arrange
        String encodedText = "";
        int offset = -1;
        Document doc = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void splitText_SplittingAtPositiveOffset_ReturnsNode() {
        // Arrange
        String encodedText = "";
        int offset = 1;
        Document doc = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void text_SplittingAtZeroOffset_ReturnsNode() {
        // Arrange
        String encodedText = "";
        int offset = 0;
        Document doc = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void text_SplittingAtNegativeOffset_ReturnsNode() {
        // Arrange
        String encodedText = "";
        int offset = -1;
        Document doc = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void text_SplittingAtPositiveOffset_ReturnsNode() {
        // Arrange
        String encodedText = "";
        int offset = 1;
        Document doc = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void clone_ReturnsSameNode() {
        // Arrange
        TextNode textNode = new TextNode("hello");

        // Act
        TextNode clonedNode = textNode.clone();

        // Assert
        assertEquals(textNode, clonedNode);
    }

    @Test
    public void outerHtmlHead_AddChildren() {
        // Arrange
        Document doc = new Document();
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        TextNode textNode = new TextNode("hello");
        append(root, 0, accum, out);

        // Assert
        assertTrue(accum.length() > 1);
    }

    private void append(Appendable accum, int depth, Appendable parent, Document.OutputSettings settings) {
        String nodeText = toString();

        if (nodeText.isEmpty()) {
            return;
        }

        if (!settings.isAppendString(nodeText)) {
            String leadingSpaces = new StringBuilder().append("  ").toString();
            String trailingSpaces = new StringBuilder().reverse().toString() + "\n";

            accum.append(leadingSpaces).append(trailingSpaces);
        } else {
            accum.append(nodeText);
        }

        append(root, depth, parent, settings);
    }

}