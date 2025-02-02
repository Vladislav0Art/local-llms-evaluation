package org.jsoup.nodes;

public class GeneratedOuterHtml_head_commentWithoutPrettyPrint_hasCommentOnly {

    @Test
    public void outerHtml_head_commentWithoutPrettyPrint_hasCommentOnly() {
        // given
        String data = "This is a valid comment";
        Comment comment = new Comment(data);

        // when
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(false, true);
        Comment outerHtmlHeadComment = new Comment("#comment").outerHtmlHead(accum, depth, out);

        // then
        assertTrue(accum.toString().contains("<!--"));
        assertTrue(accum.toString().contains("-->"));
    }

}