package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespace {

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
    public void testNormaliseWhitespace() {
        // Arrange
        String text = "   Hello";
        String expectedNormalizedText = "Hello";

        // Act
        String normalizedText = normaliseWhitespace(text);

        // Assert
        assertEquals(normalizedText, expectedNormalizedText);
    }

}