package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        String data = "#Comment is a sample comment.";
        Comment comment = new Comment(data);
        Appendable accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, null).append("\n").append(accum.toString()).append("\n");
        assertEquals("<!--\n#Comment is a sample comment.\n-->", accum.toString());
    }

}