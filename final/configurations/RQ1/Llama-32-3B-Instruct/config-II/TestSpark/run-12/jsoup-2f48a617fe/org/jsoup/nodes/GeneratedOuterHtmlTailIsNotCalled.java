package org.jsoup.nodes;

public class GeneratedOuterHtmlTailIsNotCalled {

    @Test
    public void outerHtmlTailIsNotCalled() {
        // given
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("This is a comment");

        // when
        comment.outerHtmlTail(accum, depth, out);

        // then
        verifyNoMoreInteractions(accum);
    }

}