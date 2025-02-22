package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_ShouldNotAppendHtmlComment {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("testData");
    }

    @Test
    public void outerHtmlTail_ShouldNotAppendHtmlComment() throws IOException {
        Appendable accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, new Document.OutputSettings());

        assertEquals("", accum.toString());
    }

}