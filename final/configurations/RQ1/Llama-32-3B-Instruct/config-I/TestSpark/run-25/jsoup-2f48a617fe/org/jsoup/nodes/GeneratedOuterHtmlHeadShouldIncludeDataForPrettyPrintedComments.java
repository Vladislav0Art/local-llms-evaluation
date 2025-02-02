package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadShouldIncludeDataForPrettyPrintedComments {

    @Test
    public void outerHtmlHeadShouldIncludeDataForPrettyPrintedComments() throws IOException {
        String data = "This is a test";
        Comment comment = new Comment(data);
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Document document = mock(Document.class);
        int depth = 0;
        comment.outerHtmlHead(accum, depth, out);
        verify(accum).append(anyString());
    }

}