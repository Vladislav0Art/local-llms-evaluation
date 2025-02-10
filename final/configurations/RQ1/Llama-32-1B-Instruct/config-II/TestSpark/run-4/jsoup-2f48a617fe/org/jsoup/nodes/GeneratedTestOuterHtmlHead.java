package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Appendable accum = new StringBuilder();
        Document outputSettings = new Document.OutputSettings().prettyPrint(true).outline(false);
        Comment comment = new Comment("#comment");
        comment.outerHtmlHead(accum, 0, outputSettings);
        assertEquals("<!-- This is a comment -->", accum.toString());
    }

}