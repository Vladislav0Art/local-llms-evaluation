package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadShouldNotBeCalledByDefault {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void outerHtmlHeadShouldNotBeCalledByDefault() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment(COMMENT_DATA);
        comment.outerHtmlHead(accum, 0, out);
        verify(accum, never()).append(anyString());
    }

}