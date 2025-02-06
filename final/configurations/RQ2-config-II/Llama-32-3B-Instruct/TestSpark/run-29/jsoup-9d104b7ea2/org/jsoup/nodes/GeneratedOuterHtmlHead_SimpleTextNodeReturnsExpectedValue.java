package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_SimpleTextNodeReturnsExpectedValue {

    @Test
    public void outerHtmlHead_SimpleTextNodeReturnsExpectedValue() throws IOException {
        // Arrange
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        TextNode node = new TextNameSpace("test");

        // Act
        node.outerHtmlHead(accum, 0, out);

        // Assert
        assertEquals("<text>test</text>", accum.toString());
    }

}