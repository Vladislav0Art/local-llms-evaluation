package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadTest {

    private Comment comment;

    @Test
    public void outerHtmlHeadTest() throws IOException {
        // Arrange
        comment = new Comment("data");
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();

        // Act
        comment.outerHtmlHead(accum, 0, out);

        // Assert
        assertEquals("<!--data-->", accum.toString());
    }

}