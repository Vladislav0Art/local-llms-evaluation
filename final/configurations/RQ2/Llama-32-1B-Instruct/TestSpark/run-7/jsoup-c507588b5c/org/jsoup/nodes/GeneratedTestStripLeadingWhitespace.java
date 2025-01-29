package org.jsoup.nodes;

public class GeneratedTestStripLeadingWhitespace {

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
    public void testStripLeadingWhitespace() {
        // Arrange
        String text = "   Hello";
        String expectedStrippedText = "Hello";

        // Act
        String strippedText = stripLeadingWhitespace(text);

        // Assert
        assertEquals(strippedText, expectedStrippedText);
    }

}