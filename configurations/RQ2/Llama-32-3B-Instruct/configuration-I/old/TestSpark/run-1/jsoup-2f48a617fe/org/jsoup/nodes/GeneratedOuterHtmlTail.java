package org.jsoup.nodes;

public class GeneratedOuterHtmlTail {

    @Test
    public void outerHtmlTail() {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("test");
        comment.outerHtmlTail(accum, depth, out);
        assertNotNull(accum.toString());
    }

}