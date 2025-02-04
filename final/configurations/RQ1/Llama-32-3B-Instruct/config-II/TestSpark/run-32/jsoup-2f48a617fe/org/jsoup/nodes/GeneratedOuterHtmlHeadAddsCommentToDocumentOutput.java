package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadAddsCommentToDocumentOutput {

    @Test
    public void outerHtmlHeadAddsCommentToDocumentOutput() throws IOException {
        Document document = Document.create();
        Appendable accum = new StringBuilder();
        Comment comment = new Comment("<!-- comment -->");
        comment.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("<!-- comment-->", accum.toString());
    }

}