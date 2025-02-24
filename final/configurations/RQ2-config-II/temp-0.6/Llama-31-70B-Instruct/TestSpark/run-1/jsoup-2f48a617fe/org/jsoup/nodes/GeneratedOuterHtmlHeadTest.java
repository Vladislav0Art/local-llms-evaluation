package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadTest {

    private Comment comment;

    @Test
    public void outerHtmlHeadTest() throws IOException {
        comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("<!--data-->", accum.toString());
    }

}