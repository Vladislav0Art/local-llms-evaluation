package org.jsoup.nodes;

public class Generated[TextNodeOuterHtmlHead]

ShouldNotIndentWhenTextNodeIsBlankAndNextSiblingIsElementOrTextNode {

    @Test
    public void [TextNodeOuterHtmlHead]ShouldNotIndentWhenTextNodeIsBlankAndNextSiblingIsElementOrTextNode() {
        // Arrange
        String expectedText = "   ";
        Appendable expectedAccumulatedText = new StringBuilder(expectedText);
        Document.OutputSettings outSettings = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");

        // Act
        Appendable accumulatedText = new StringBuilder();
        int depth = 0;
        document.outputHtmlHead(accumulatedText, depth, outSettings, textNode);

        // Assert
        assertTrue(accumulatedText.toString().equals(expectedText));
    }

}