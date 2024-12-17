package org.jsoup.nodes;

public class GeneratedDataShouldBePassedToOuterHtmlHeadMethod {

    @Test
    public void dataShouldBePassedToOuterHtmlHeadMethod() throws IOException {
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        Comment comment = new Comment("This is a test");
        comment.outerHtmlHead(appendable, 0, out);
        verify(appendable).append("<!--This is a test-->");
    }

}