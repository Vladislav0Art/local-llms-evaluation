package org.jsoup.nodes;

public class GeneratedOuterHtmlTailWorksAsExpected {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("data");
    }

    @Test
    public void outerHtmlTailWorksAsExpected() {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new OutputSettings();
        comment.outerHtmlTail(accum, depth, out);
        String expectedHtml = "";
        assertFalse(accum.toString().isEmpty());
    }

}