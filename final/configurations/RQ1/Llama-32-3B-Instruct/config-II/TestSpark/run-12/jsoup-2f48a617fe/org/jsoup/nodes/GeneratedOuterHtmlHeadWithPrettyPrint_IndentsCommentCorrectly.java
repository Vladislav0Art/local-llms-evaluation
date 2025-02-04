package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadWithPrettyPrint_IndentsCommentCorrectly {

    @Test
    public void outerHtmlHeadWithPrettyPrint_IndentsCommentCorrectly() {
        // given
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Document document = new Document();

        Comment comment = new Comment("This is a comment");

        // when
        comment.outerHtmlHead(accum, depth, out);

        // then
        verify(accum).append("<!--").append(comment.getData()).append("-->");
    }

}