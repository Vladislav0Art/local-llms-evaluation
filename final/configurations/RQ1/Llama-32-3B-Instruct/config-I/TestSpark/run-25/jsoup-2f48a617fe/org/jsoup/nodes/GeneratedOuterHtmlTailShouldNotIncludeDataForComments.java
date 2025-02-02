package org.jsoup.nodes;

public class GeneratedOuterHtmlTailShouldNotIncludeDataForComments {

    @Test
    public void outerHtmlTailShouldNotIncludeDataForComments() {
        Comment comment = new Comment("This is a test");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Document document = mock(Document.class);
        int depth = 0;
        comment.outerHtmlTail(accum, depth, out);
        verifyNoMoreInteractions(accum);
    }

}