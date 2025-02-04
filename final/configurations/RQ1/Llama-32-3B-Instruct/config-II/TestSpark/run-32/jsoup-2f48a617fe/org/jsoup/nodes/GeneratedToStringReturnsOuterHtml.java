package org.jsoup.nodes;

public class GeneratedToStringReturnsOuterHtml {

    @Test
    public void toStringReturnsOuterHtml() throws IOException {
        Appendable accum = new StringBuilder();
        Comment comment = new Comment("<!-- comment -->");
        comment.toString();
        assertEquals("<!-- comment-->", accum.toString());
    }

}