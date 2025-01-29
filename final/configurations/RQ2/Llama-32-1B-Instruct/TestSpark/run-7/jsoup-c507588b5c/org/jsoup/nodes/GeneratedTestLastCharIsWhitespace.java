package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespace {

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