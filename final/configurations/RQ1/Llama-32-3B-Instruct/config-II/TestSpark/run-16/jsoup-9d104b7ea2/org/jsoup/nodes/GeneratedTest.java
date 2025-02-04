package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void newNodeTextCreatedFromEncodedTest() {
        // Arrange
        String encodedText = "<a>&lt;test&gt;</a>";
        TextNode node = new TextNode(TextNode.createFromEncoded(encodedText));

        // Act & Assert
        assertEquals("test", node.text());
    }

    @Test
    public void newNodeTextCreatedFromEncodedWithSpacesTest() {
        // Arrange
        String encodedText = "<a>&lt;test with spaces&gt;</a>";
        TextNode node = new TextNode(TextNode.createFromEncoded(encodedText));

        // Act & Assert
        assertEquals(" test with spaces ", node.text());
    }

    @Test
    public void newNodeTextCreatedFromEncodedWithNewlinesTest() {
        // Arrange
        String encodedText = "<a>&lt;test with newline&gt;</a>";
        TextNode node = new TextNode(TextNode.createFromEncoded(encodedText));

        // Act & Assert
        assertEquals(" test with newline ", node.text());
    }

    @Test
    public void newNodeTextCreatedFromEncodedWithMultipleSpacesTest() {
        // Arrange
        String encodedText = "<a>&lt;test with multiple spaces&gt;</a>";
        TextNode node = new TextNode(TextNode.createFromEncoded(encodedText));

        // Act & Assert
        assertEquals(" test with multiple spaces ", node.text());
    }

    @Test
    public void newNodeTextCreatedFromEncodedWithNewlinesAndSpacesTest() {
        // Arrange
        String encodedText = "<a>&lt;test with newline and spaces&gt;</a>";
        TextNode node = new TextNode(TextNode.createFromEncoded(encodedText));

        // Act & Assert
        assertEquals(" test with newline and spaces ", node.text());
    }

    @Test
    public void splitTextAtOffsetReturnsCorrectTextNode() {
        // Arrange
        String text = "Hello World";
        int offset = 7;
        TextNode node = new TextNode(text);

        // Act & Assert
        assertSame(node, node.splitText(offset).text());
    }

    @Test
    public void splitTextAtOffsetReturnsCorrectNodeWhenOffsetIsZero() {
        // Arrange
        String text = "Hello World";
        int offset = 0;
        TextNode node = new TextNode(text);

        // Act & Assert
        assertSame(node, node.splitText(offset).text());
    }

    @Test
    public void splitTextAtNegativeOffsetThrowsException() {
        // Arrange
        String text = "Hello World";
        int offset = -1;
        TextNode node = new TextNode(text);

        // Act
        node.splitText(offset);
    }

    @Test
    public void splitTextAtOffsetGreaterThanLengthThrowsException() {
        // Arrange
        String text = "Hello World";
        int offset = 10;
        TextNode node = new TextNode(text);

        // Act
        node.splitText(offset);
    }

    @Test
    public void isBlankReturnsCorrectBooleanValue() {
        // Arrange
        String text = "\t\t";
        TextNode node = new TextNode(text);

        // Act & Assert
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlankReturnsFalseWhenTextIsNotEmpty() {
        // Arrange
        String text = "Hello World";
        TextNode node = new TextNode(text);

        // Act & Assert
        assertFalse(node.isBlank());
    }

}