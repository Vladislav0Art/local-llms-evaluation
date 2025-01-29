package org.jsoup.nodes;

public class GeneratedTestCreateFromEncoded {

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
    public void testCreateFromEncoded() {
        // Arrange
        String encodedText = "";
        LeafNode textNode = new TestTextNode(encodedText);

        // Act
        LeafNode expectedTextNode = new TestTextNode(encodedText);

        // Assert
        assertEquals(expectedTextNode, textNode);
    }

}