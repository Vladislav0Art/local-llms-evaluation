package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Appendable accum = new StringBuilder();
        Document doc = new Document();
        Comment comment = new Comment("#comment");
        append(accum, comment.outerHtmlHead(doc, 0, null));
        assertEquals("<!--#comment-->", accum.toString());
    }

}