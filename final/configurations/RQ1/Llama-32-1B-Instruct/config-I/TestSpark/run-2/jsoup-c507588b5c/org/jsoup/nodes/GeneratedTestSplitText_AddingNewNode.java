package org.jsoup.nodes;

public class GeneratedTestSplitText_AddingNewNode {

    @Test
    public void testSplitText_AddingNewNode() {
        // Arrange
        TextNode textNode = createFromEncoded("&amp;lt;");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        TextNode result = textNode.splitText(10);

        // Assert
        assertTrue(result != null, "splitText() returned unexpected result");
    }

}