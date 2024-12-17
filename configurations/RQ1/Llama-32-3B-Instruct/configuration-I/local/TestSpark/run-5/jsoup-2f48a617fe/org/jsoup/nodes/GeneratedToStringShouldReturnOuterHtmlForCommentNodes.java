package org.jsoup.nodes;

public class GeneratedToStringShouldReturnOuterHtmlForCommentNodes {

    @Test
    public void toStringShouldReturnOuterHtmlForCommentNodes() throws IOException {
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        Comment comment = new Comment("This is a test");
        assertEquals("<!--This is a test-->", comment.toString());
    }

}