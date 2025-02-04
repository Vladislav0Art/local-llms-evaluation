package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadShouldNotAppendDataIfPrettyPrintIsFalse {

    private Comment comment;

    @Test
    public void outerHtmlHeadShouldNotAppendDataIfPrettyPrintIsFalse() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(false);
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("", accum.toString());
    }

}