package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadIsCorrectForNonEmptyComment {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void outerHtmlHeadIsCorrectForNonEmptyComment() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("This is a comment.");
        comment.outerHtmlHead(accum, depth, out);
        Assert.assertTrue(accum.toString().equals("<!-- This is a comment. -->"));
    }

}