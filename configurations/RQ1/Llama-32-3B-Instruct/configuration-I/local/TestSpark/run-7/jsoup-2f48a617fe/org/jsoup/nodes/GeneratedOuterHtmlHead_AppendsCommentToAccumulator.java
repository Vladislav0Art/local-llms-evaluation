package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_AppendsCommentToAccumulator {

    @Test
    public void outerHtmlHead_AppendsCommentToAccumulator() throws IOException {
        Appendable accum = mock(Appendable.class);
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, 0, Document.OutputSettings.DEFAULT);
        assertEquals(3, accum.length());
        assertEquals("<!--", accum.charAt(0));
    }

}