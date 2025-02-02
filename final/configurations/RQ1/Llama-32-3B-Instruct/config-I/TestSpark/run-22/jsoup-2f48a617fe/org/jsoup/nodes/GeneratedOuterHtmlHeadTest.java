package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(true);
        Comment comment = new Comment("<!-- This is a comment -->");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--This is a comment-->", accum.toString());
    }

}