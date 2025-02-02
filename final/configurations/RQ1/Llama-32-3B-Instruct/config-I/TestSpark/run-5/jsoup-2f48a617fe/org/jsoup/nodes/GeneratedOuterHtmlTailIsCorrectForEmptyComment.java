package org.jsoup.nodes;

public class GeneratedOuterHtmlTailIsCorrectForEmptyComment {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void outerHtmlTailIsCorrectForEmptyComment() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment(EMPTY_COMMENT);
        comment.outerHtmlTail(accum, depth, out);
    }

}