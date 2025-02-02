package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadIsCorrectForEmptyComment {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void outerHtmlHeadIsCorrectForEmptyComment() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment(EMPTY_COMMENT);
        comment.outerHtmlHead(accum, depth, out);
        Assert.assertTrue(accum.toString().equals("<!-- -->"));
    }

}