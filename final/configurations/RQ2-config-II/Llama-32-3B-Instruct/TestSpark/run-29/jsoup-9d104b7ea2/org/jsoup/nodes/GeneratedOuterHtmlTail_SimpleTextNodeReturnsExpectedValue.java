package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_SimpleTextNodeReturnsExpectedValue {

    @Test
    public void outerHtmlTail_SimpleTextNodeReturnsExpectedValue() throws IOException {
        // Arrange
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        TextNode node = new TextNameSpace("test");

        // Act
        node.outerHtmlTail(accum, 0, out);

        // Assert
        assertEquals("<text>test</text>", accum.toString());
    }

}