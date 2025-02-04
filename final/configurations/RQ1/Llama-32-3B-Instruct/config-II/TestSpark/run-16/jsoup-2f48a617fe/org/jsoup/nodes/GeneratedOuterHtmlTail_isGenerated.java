package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_isGenerated {

    @Test
    public void outerHtmlTail_isGenerated() throws IOException {
        // Given
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);

        // When
        Comment comment = new Comment("This is a comment");
        comment.outerHtmlHead(accum, 0, out);

        comment.outerHtmlTail(accum, 0, out);

        // Then
        verifyNoMoreInteractions(accum);
    }

}