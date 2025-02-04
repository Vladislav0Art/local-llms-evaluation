package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_AppendsCommentDataWhenPrettyPrinted {

    @Test
    public void outerHtmlHead_AppendsCommentDataWhenPrettyPrinted() throws IOException {
        Comment comment = new Comment("Hello World");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        when(out.outline()).thenReturn(false);

        comment.outerHtmlHead(accum, 0, out);

        verify(accum).append("<!--Hello World-->");
    }

}