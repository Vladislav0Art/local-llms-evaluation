package org.jsoup.nodes;

public class GeneratedOuterHtmlTailTest {

    private Comment comment;

    @Test
    public void outerHtmlTailTest() throws IOException {
        // Arrange
        comment = new Comment("data");
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();

        // Act
        comment.outerHtmlTail(accum, 0, out);

        // Assert
        assertEquals("", accum.toString());
    }

}