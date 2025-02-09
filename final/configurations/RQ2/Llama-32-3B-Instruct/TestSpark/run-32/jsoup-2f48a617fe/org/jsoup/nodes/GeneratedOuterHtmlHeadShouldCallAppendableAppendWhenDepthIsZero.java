package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadShouldCallAppendableAppendWhenDepthIsZero {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void outerHtmlHeadShouldCallAppendableAppendWhenDepthIsZero() throws IOException {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.depth).thenReturn(0);
        Comment comment = new Comment(COMMENT_DATA);
        comment.outerHtmlHead(accum, 0, out);
        verify(accum).append(anyString());
    }

}