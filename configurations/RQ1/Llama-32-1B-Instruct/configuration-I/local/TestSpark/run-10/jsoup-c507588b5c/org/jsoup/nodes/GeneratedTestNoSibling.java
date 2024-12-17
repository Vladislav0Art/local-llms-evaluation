package org.jsoup.nodes;

public class GeneratedTestNoSibling {

    @Test
    public void testNoSibling() {
        // Arrange
        String text = "Hello World";

        // Act
        Document.OutputSettings out = Document.OutputSettings.defaultOutputSettings();
        TextNode.text(text);

        // Assert
        assertEquals("Hello World", TextNode.getWholeText());
    }

}