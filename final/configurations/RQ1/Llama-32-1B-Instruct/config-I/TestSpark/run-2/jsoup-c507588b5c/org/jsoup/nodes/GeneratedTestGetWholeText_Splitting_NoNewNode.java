package org.jsoup.nodes;

public class GeneratedTestGetWholeText_Splitting_NoNewNode {

    @Test
    public void testGetWholeText_Splitting_NoNewNode() {
        // Arrange
        String text = "&amp;lt;";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        TextNode result = nodeGetWholeText();

        // Assert
        assertTrue(result != null, "nodeGetWholeText() returned unexpected result");
    }

}