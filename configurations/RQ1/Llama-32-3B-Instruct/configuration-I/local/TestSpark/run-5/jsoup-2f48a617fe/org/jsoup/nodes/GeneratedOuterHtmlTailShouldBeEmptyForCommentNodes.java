package org.jsoup.nodes;

public class GeneratedOuterHtmlTailShouldBeEmptyForCommentNodes {

    @Test
    public void outerHtmlTailShouldBeEmptyForCommentNodes() throws IOException {
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("This is a test");
        comment.outerHtmlHead(appendable, 0, out);
        comment.outerHtmlTail(appendable, 0, out);
        verifyNoMoreInteractions(appendable);
    }

}