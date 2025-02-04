package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadIncludesCommentData {

    @Test
    public void outerHtmlHeadIncludesCommentData() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("Comment Data");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!--Comment Data-->", accum.toString());
    }

}