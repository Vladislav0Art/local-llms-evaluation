package org.jsoup.nodes;

public class GeneratedOuterHtmlTailIsCorrectForNonEmptyComment {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void outerHtmlTailIsCorrectForNonEmptyComment() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("This is a comment.");
        comment.outerHtmlTail(accum, depth, out);
    }

}