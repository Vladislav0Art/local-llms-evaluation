package org.jsoup.nodes;

public class GeneratedTestSibling {

    @Test
    public void testSibling() {
        // Arrange
        String text = "Hello\nWorld";

        // Act
        Document.OutputSettings out = Document.OutputSettings.defaultOutputSettings();
        TextNode.text(text);

        // Assert
        assertEquals("Hello \n World", TextNode.getWholeText());
    }

}