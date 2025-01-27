package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadTextNode_GivenValidText_AppendsCorrectHtml {

    @Test
    public void outerHtmlHeadTextNode_GivenValidText_AppendsCorrectHtml() throws IOException {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        TextNode textNode = new TextNode("test");
        Appendable accum = outContent;

        // Act
        textNode.outerHtmlHead(accum, 0, Document.OutputSettings.DEFAULT);

        // Assert
        assertTrue(outContent.toString().contains("<p>test</p>"));
    }

}