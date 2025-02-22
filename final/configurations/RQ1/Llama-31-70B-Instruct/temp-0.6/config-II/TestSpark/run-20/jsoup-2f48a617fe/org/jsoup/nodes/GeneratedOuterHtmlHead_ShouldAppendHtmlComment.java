package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_ShouldAppendHtmlComment {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("testData");
    }

    @Test
    public void outerHtmlHead_ShouldAppendHtmlComment() throws IOException {
        Appendable accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, new Document.OutputSettings());

        assertEquals("<!--testData-->", accum.toString());
    }

}