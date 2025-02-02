package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Comment comment = new Comment("");
        Appendable accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, Document.OutputSettings.PrettyPrint(true));
        assertEquals("<!-- test content -->", accum.toString());
    }

}