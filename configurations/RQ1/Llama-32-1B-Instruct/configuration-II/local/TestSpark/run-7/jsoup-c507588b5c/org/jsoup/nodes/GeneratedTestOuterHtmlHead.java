package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        // Arrange
        String text = "   ";
        TextNode rootNode = new TextNode(text);

        // Act
        Appender appender = new Appendable();
        Document document = new Document();
        node.outerHtmlHead(appender, 1, document.out);
        assertEquals("   ", appender.toString());
    }

}