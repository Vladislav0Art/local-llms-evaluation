package org.jsoup.nodes;

public class GeneratedOuterHtmlTailShouldNotAppendAnythingToHeadTag {

    private Comment comment;

    @Test
    public void outerHtmlTailShouldNotAppendAnythingToHeadTag() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true);
        comment.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

}