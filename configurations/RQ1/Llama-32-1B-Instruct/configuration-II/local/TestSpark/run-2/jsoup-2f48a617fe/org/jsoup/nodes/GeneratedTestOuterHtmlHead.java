package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private static final Comment COMMENT = new Comment("This is an example comment");

    @Test
    public void testOuterHtmlHead() throws IOException, InterruptedException {
        Appendable accum = new StringBuilder();
        COMMENT.outerHtmlHead(accum, 0, Document.OutputSettings.PrettyPrint());
        assertEquals("<!--\nThis is an example comment\n-->\n", accum.toString());
    }

}