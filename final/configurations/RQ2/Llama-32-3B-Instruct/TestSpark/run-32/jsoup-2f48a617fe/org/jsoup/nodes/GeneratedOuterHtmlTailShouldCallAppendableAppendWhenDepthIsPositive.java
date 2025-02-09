package org.jsoup.nodes;

public class GeneratedOuterHtmlTailShouldCallAppendableAppendWhenDepthIsPositive {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void outerHtmlTailShouldCallAppendableAppendWhenDepthIsPositive() throws IOException {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.depth).thenReturn(1);
        Comment comment = new Comment(COMMENT_DATA);
        comment.outerHtmlTail(accum, 1, out);
        verify(accum).append(anyString());
    }

}