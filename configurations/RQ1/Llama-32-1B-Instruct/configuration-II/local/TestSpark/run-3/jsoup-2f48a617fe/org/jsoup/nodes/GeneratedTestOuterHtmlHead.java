package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Comment comment = new Comment("#comment");
        Appendable accum = new StringBuilder();
        appender.append(comment.outerHtmlHead(accum, 0, Document.OutputSettings.PrettyPrint()));
        assertEquals("<!--#comment-->", accum.toString());
    }

}