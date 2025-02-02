package org.jsoup.nodes;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- This is a comment -->");
        comment.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

}