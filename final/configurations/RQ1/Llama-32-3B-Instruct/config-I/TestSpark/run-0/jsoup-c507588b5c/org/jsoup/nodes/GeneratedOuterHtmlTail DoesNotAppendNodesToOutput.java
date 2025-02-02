package org.jsoup.nodes;

public class GeneratedOuterHtmlTail DoesNotAppendNodesToOutput {

    @Test
    public void outerHtmlTail

    DoesNotAppendNodesToOutput() throws IOException {
        // Arrange
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode textNode = new TextNode("Hello World");
        document.addTextNode(textNode);
        document.output(accum, Document.OutputSettings.PRETTY_PRINT);

        // Assert
        String expectedOutput = "<p>Hello <span>World</span></p>";
        assertEquals(expectedOutput, accum.toString());
    }

}