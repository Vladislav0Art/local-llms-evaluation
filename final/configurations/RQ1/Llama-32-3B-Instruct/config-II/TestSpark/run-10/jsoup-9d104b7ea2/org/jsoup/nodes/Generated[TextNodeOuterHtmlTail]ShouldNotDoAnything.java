package org.jsoup.nodes;

public class Generated[TextNodeOuterHtmlTail]

ShouldNotDoAnything {

    @Test
    public void [TextNodeOuterHtmlTail]ShouldNotDoAnything() {
        // Arrange

        // Act and Assert
        Appendable accumulatedText = new StringBuilder();
        int depth = 0;
        Document.OutputSettings outSettings = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(accumulatedText, depth, outSettings);
        assertEquals("", accumulatedText.toString());
    }

}