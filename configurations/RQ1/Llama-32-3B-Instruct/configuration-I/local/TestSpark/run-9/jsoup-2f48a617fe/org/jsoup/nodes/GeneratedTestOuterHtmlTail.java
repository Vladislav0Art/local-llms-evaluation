package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        org.jsoup.nodes.Appendable accum = new org.jsoup.nodes.Appendable();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("Hello World!");
        Comment outerHtmlTailResult = comment.outerHtmlTail(accum, 0, out);
        assertNull(outerHtmlTailResult);
    }

}