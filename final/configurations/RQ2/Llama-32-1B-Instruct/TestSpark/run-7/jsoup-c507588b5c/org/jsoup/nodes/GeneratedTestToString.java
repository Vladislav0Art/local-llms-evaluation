package org.jsoup.nodes;

public class GeneratedTestToString {

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

}