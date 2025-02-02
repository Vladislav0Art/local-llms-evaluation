package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadShouldAppendCommentWithDataToAccumulator {

    @Test
    public void outerHtmlHeadShouldAppendCommentWithDataToAccumulator() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- data -->");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--data-->", accum.toString());
    }

}