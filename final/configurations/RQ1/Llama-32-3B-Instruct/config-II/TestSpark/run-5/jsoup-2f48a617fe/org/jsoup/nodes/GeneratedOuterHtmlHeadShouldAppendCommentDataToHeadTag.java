package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadShouldAppendCommentDataToHeadTag {

    private Comment comment;

    @Test
    public void outerHtmlHeadShouldAppendCommentDataToHeadTag() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true);
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--New data-->", accum.toString());
    }

}