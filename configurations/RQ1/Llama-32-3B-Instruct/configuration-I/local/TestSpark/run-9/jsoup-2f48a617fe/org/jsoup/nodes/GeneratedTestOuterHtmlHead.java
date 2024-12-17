package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        org.jsoup.nodes.Appendable accum = new org.jsoup.nodes.Appendable();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("Hello World!");
        Comment outerHtmlHeadResult = comment.outerHtmlHead(accum, 0, out);
        assertNotNull(outerHtmlHeadResult);
    }

}