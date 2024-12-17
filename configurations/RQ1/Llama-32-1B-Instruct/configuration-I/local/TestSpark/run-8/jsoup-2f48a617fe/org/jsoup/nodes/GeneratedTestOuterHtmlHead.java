package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        // Arrange
        Appendable accum = mock(Appendable.class);
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        Document document = new Document(out);

        // Act
        Comment comment = new Comment("#This is a sample comment.");
        comment.outerHtmlHead(accum, depth, document);

        // Assert
        assertEquals("<!--This is a sample comment.-->", accum.toString());
    }

}