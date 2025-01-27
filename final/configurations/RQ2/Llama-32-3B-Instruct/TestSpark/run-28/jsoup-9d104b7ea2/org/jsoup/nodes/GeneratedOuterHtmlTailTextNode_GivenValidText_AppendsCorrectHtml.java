package org.jsoup.nodes;

public class GeneratedOuterHtmlTailTextNode_GivenValidText_AppendsCorrectHtml {

    @Test
    public void outerHtmlTailTextNode_GivenValidText_AppendsCorrectHtml() throws IOException {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        TextNode textNode = new TextNode("test");
        Appendable accum = outContent;

        // Act
        textNode.outerHtmlTail(accum, 0, Document.OutputSettings.DEFAULT);

        // Assert
        assertTrue(outContent.toString().contains("</p>"));
    }

}