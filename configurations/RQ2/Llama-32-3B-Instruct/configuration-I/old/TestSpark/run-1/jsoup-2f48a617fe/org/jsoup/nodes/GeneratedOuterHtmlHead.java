package org.jsoup.nodes;

public class GeneratedOuterHtmlHead {

    @Test
    public void outerHtmlHead() {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("test");
        comment.outerHtmlHead(accum, depth, out);
        assertNotNull(accum.toString());
    }

}