package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadWithoutPrettyPrint_DoesNotIndentComment {

    @Test
    public void outerHtmlHeadWithoutPrettyPrint_DoesNotIndentComment() {
        // given
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Document document = new Document();

        Comment comment = new Comment("This is a comment");

        // when
        comment.outerHtmlHead(accum, depth, out);

        // then
        verifyNoMoreInteractions(accum);
    }

}