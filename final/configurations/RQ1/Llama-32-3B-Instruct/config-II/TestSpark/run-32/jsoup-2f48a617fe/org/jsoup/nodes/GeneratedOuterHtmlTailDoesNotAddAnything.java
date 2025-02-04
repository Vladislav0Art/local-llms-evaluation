package org.jsoup.nodes;

public class GeneratedOuterHtmlTailDoesNotAddAnything {

    @Test
    public void outerHtmlTailDoesNotAddAnything() {
        Appendable accum = new StringBuilder();
        Comment comment = new Comment("<!-- comment -->");
        comment.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertTrue(accum.length() == 0);
    }

}