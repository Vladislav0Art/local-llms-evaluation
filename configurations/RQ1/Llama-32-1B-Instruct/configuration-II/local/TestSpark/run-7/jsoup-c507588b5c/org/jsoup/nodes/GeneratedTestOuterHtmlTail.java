package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        // Arrange
        String text = "   ";
        TextNode rootNode = new TextNode(text);

        // Act
        Appender appender = new Appendable();
        Document document = new Document();
        node.outerHtmlHead(appender, 1, document.out);
        node.outerHtmlTail(appender, 1, document.out);
        assertEquals("   ", appender.toString());
    }

}