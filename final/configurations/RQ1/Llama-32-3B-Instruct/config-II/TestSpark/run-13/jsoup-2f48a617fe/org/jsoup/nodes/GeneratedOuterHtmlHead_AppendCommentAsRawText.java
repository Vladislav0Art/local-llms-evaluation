package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_AppendCommentAsRawText {

    @Test
    public void outerHtmlHead_AppendCommentAsRawText() {
        // given
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<some>comment</some>");

        // when
        comment.outerHtmlHead(accum, depth, out);

        // then
        String expectedOutput = "<!--<some>comment</some--> -->\n";
        assertEquals(expectedOutput, accum.toString());
    }

}