package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Comment comment = new Comment("#comment");
        Appendable accum = new StringBuilder();
        appenders.append(comment.outerHtmlTail(accum, 0, Document.OutputSettings.Outline()));
        assertEquals("", accum.toString());
    }

}