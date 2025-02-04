package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_ShouldNotAppendAnything {

    @Test
    public void outerHtmlTail_ShouldNotAppendAnything() {
        // given
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<some>comment</some>");

        // when
        comment.outerHtmlHead(accum, depth, out);

        // then
        assert !accum.toString().contains("\n");
    }

}