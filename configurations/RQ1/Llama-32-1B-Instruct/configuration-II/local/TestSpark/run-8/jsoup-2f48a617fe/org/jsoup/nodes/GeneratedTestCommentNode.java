package org.jsoup.nodes;

public class GeneratedTestCommentNode {

    @Test
    public void testCommentNode() {
        // Arrange
        String data = "#comment";
        Appendable accum = new StringBuilder();
        Document OutputSettings = Document.OutputSettings.create();

        // Act
        Comment comment = new Comment(data);

        // Assert
        assertEquals("#comment", comment.nodeName());
        assertEquals("<!--" + data + "-->", comment.outerHtmlHead(accum, 0, OutputSettings));
        assertEquals("<!--" + data + "-->", comment.outerHtmlTail(accum, 0, OutputSettings));
    }

}