package org.jsoup.nodes;

public class GeneratedOuterHtmlTailShouldNotBeCalledByDefault {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void outerHtmlTailShouldNotBeCalledByDefault() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment(COMMENT_DATA);
        comment.outerHtmlTail(accum, 0, out);
        verify(accum, never()).append(anyString());
    }

}