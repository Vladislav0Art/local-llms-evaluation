package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadShouldAppendCommentData {

    @Test
    public void outerHtmlHeadShouldAppendCommentData() {
        Comment comment = new Comment("test");
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        outerHtmlHead(comment, depth, out).when(accum::append).thenReturn(accum);
    }

}