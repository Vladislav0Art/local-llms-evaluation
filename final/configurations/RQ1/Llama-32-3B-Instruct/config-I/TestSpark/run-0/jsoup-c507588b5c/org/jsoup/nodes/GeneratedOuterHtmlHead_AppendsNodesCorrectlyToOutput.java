package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_AppendsNodesCorrectlyToOutput {

    @Test
    public void outerHtmlHead_AppendsNodesCorrectlyToOutput() throws IOException {
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