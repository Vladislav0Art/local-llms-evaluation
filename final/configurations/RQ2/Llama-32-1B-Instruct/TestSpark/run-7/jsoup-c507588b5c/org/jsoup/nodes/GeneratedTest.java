package org.jsoup.nodes;

public class GeneratedTest {

    @Override
    public String nodeName() {
        return "text";
    }

    @Override
    public String text() {
        return "";
    }

    @Override
    public TextNode text(String text) {
        return new TextNode(text);
    }

    public String getWholeText() {
        return "";
    }

    public boolean isBlank() {
        return false;
    }

    public TextNode splitText(int offset) {
        return new TextNode(offset);
    }
}

public class DocumentTest {

    @Test
    public void testToString() {
        // Arrange
        LeafNode document = new TestTextNode();
        Appendable appender = document.createDocumentFragment();

        // Act
        String expectedString = "text";

        // Assert
        assertEquals(expectedString, document.toString());
    }

    @Test
    public void testClone() {
        // Arrange
        LeafNode document = new TestTextNode();
        Appendable appender = document.createDocumentFragment();
        String text = "";
        int depth = 0;
        Document.OutputSettings out = Document.OutputSettings.INDENT_OUTPUT;

        // Act
        TextNode expectedTextNode = new TestTextNode(text);

        // Assert
        assertEquals(expectedTextNode, document.clone());
    }

    @Test
    public void testCreateFromEncoded() {
        // Arrange
        String encodedText = "";
        LeafNode textNode = new TestTextNode(encodedText);

        // Act
        LeafNode expectedTextNode = new TestTextNode(encodedText);

        // Assert
        assertEquals(expectedTextNode, textNode);
    }

    @Test
    public void testNormaliseWhitespace() {
        // Arrange
        String text = "   Hello";
        String expectedNormalizedText = "Hello";

        // Act
        String normalizedText = normaliseWhitespace(text);

        // Assert
        assertEquals(normalizedText, expectedNormalizedText);
    }

    @Test
    public void testStripLeadingWhitespace() {
        // Arrange
        String text = "   Hello";
        String expectedStrippedText = "Hello";

        // Act
        String strippedText = stripLeadingWhitespace(text);

        // Assert
        assertEquals(strippedText, expectedStrippedText);
    }

    @Test
    public void testLastCharIsWhitespace() {
        // Arrange
        StringBuilder builder = new StringBuilder();
        String text = "   Hello";
        int index = 0;

        // Act
        boolean lastCharIsWhitespace = lastCharIsWhitespace(builder);

        // Assert
        assertEquals(lastCharIsWhitespace, index == text.length() - 1);
    }

}