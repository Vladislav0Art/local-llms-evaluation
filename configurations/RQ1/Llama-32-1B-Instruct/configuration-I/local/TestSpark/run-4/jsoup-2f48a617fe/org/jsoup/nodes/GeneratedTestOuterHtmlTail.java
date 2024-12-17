package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        String data = "#Comment is a sample comment.";
        Comment comment = new Comment(data);
        Appendable accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, null).append("\n").append(accum.toString()).append("\n");
        assertEquals("<!--\n#Comment is a sample comment.\n-->", accum.toString());
    }

}