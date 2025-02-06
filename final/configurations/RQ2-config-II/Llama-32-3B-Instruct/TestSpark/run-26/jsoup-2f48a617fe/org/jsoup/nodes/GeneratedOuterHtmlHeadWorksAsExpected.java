package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadWorksAsExpected {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("data");
    }

    @Test
    public void outerHtmlHeadWorksAsExpected() throws IOException {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new OutputSettings();
        comment.outerHtmlHead(accum, depth, out);
        String expectedHtml = "<!-- data -->";
        assertTrue(accum.toString().contains(expectedHtml));
    }

}