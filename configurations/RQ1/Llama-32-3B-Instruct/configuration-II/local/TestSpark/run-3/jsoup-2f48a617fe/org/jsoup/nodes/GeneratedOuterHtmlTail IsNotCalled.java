package org.jsoup.nodes;

public class GeneratedOuterHtmlTail IsNotCalled {

    @Test
    public void outerHtmlTail

    IsNotCalled() {
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, depth, out);
        verifyNoMoreInteractions(accum);
    }

}