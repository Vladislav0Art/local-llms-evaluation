package org.jsoup.nodes;

public class GeneratedTestTextNodeOutputSettings {

    @Test
    public void testTextNodeOutputSettings() {
        // Arrange
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Appendable output = document.open();

        String text = "Hello, World!";
        LeafNode leafNode = new LeafNode();

        // Act
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(output, 0, null);

        // Assert
        assertEquals(5, output.length());
    }

}