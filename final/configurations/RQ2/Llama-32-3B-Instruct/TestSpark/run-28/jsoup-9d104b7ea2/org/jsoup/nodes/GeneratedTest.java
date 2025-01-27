package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }
}

public class TextNode {
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextNode textNode = (TextNode) o;
        return Objects.equals(text, textNode.text);
    }
}

public class Document.

OutputSettings {
    private String getText () {
        // implementation
        return "";
    }

    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document.OutputSettings settings = (Document.OutputSettings) o;
        return Objects.equals(getText(), settings.getText());
    }
}

public class GeneratedTest {

    private Document document;

    @org.junit.Before
    public void setUp() {
        document = new Document();
    }

    @org.junit.Test
    public void testEquals() {
        Document.OutputSettings settings1 = new Document.OutputSettings();
        Document.OutputSettings settings2 = new Document.OutputSettings();

        org.junit.Assert.assertTrue(document.equals(settings1));
        org.junit.Assert.assertFalse(document.equals(new Object()));
    }

    @Test
    public void nodeNameTextTextNode_GivenValidText_ReturnsNodeName() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        String nodeName = textNode.nodeName();

        // Assert
        assertEquals("text", nodeName);
    }

    @Test
    public void getWholeTextTextNode_GivenValidText_ReturnsWholeText() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        String wholeText = textNode.getWholeText();

        // Assert
        assertEquals("test", wholeText);
    }

    @Test
    public void isBlankTextNode_GivenValidText_ReturnsFalse() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        boolean isBlank = textNode.isBlank();

        // Assert
        assertFalse(isBlank);
    }

    @Test
    public void toStringTextNode_ReturnsCorrectStringRepresentation() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        String toString = textNode.toString();

        // Assert
        assertEquals("<text>test</text>", toString);
    }

    @Test
    public void cloneTextNode_GivenValidText_ReturnsCorrectClone() {
        // Arrange
        TextNode textNode = new TextNode("test");
        TextNode clone = textNode.clone();

        // Act

        // Assert
        assertTrue(clone instanceof TextNode);
    }

    @Test
    public void createFromEncodedTextNode_GivenEncodedText_ReturnsCorrectTextNode() {
        // Arrange
        String encodedText = "test";

        // Act
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // Assert
        assertNotNull(textNode);
        assertEquals("test", textNode.text());
    }

    @Test
    public void stripLeadingWhitespace_GivenText_ReturnsCorrectString() {
        // Arrange
        String input = "test   ";

        // Act
        String expectedOutput = TextNode.stripLeadingWhitespace(input);

        // Assert
        assertEquals("test", expectedOutput);
    }

    @Test
    public void lastCharIsWhitespaceStringBuilderGivenEmptyStringBuilder_ReturnsTrue() {
        // Arrange
        StringBuilder sb = new StringBuilder();

        // Act
        boolean isLastCharWhitespace = TextNode.lastCharIsWhitespace(sb);

        // Assert
        assertTrue(isLastCharWhitespace);
    }

    @Test
    public void lastCharIsWhitespaceStringBuilder_GivenNonEmptyStringBuilder_ReturnsFalse() {
        // Arrange
        StringBuilder sb = new StringBuilder("test");

        // Act
        boolean isLastCharWhitespace = TextNode.lastCharIsWhitespace(sb);

        // Assert
        assertFalse(isLastCharWhitespace);
    }

}