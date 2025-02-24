package org.jsoup.nodes;

public class GeneratedOuterHtmlTailTest {

    private Comment comment;

    @Test
    public void outerHtmlTailTest() throws IOException {
        comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertEquals("", accum.toString());
    }

}