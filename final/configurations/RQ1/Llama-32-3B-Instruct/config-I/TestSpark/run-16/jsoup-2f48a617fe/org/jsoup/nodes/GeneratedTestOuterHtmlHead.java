package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Document.OutputSettings out = new Document.OutputSettings(false, true);
        Comment comment = new Comment("#comment");
        String accum = comment.outerHtmlHead(out, 0, out);
        assertTrue(accum.contains("\n"));
    }

}