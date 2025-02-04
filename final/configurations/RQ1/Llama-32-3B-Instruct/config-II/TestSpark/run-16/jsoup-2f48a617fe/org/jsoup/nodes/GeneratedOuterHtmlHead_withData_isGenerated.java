package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_withData_isGenerated {

    @Test
    public void outerHtmlHead_withData_isGenerated() throws IOException {
        // Given
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("This is a comment");

        when(out.prettyPrint()).thenReturn(true);
        when(out.outline()).thenReturn(false);

        // When
        comment.outerHtmlHead(accum, 0, out);

        // Then
        verify(accum).append("<!--");
        verify(accum).append(comment.getData());
        verify(accum).append("-->");
    }

}