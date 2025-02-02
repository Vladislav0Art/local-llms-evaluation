package org.jsoup.nodes;

public class GeneratedOuterHtmlTailShouldNotAppendAnythingToAccumulator {

    @Test
    public void outerHtmlTailShouldNotAppendAnythingToAccumulator() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

}