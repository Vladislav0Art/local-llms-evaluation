package org.jsoup.nodes;

public class GeneratedTestNoChildren {

    @Test
    public void testNoChildren() {
        // Arrange
        TextNode textNode = new TextNode("Hello");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = Document.OutputSettings.defaultOutputSettings();

        // Act
        textNode.outerHtmlHead(accum, 0, out);
        out.clear();
        textNode.outerHtmlTail(accum, 0, out);

        // Assert
        assertEquals("", TextNode.getWholeText());
    }

}