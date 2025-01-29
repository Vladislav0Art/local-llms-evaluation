package org.jsoup.nodes;

public class GeneratedTestClone {

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

}