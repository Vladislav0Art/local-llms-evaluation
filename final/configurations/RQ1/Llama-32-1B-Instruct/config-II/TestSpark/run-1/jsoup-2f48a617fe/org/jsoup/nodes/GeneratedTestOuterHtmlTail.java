package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Appendable accum = new StringBuilder();
        Document doc = new Document();
        Comment comment = new Comment("#comment");
        append(accum, comment.outerHtmlTail(doc, 0, null));
        assertEquals("<!--#comment-->", accum.toString());
    }

}