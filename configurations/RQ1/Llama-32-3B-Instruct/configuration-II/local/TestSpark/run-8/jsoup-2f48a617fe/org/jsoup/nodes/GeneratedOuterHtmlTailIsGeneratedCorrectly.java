package org.jsoup.nodes;

public class GeneratedOuterHtmlTailIsGeneratedCorrectly {

    @Test
    public void outerHtmlTailIsGeneratedCorrectly() {
        Comment comment = new Comment("This is a test comment.");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);

        comment.outerHtmlHead(accum, 0, out); // Trigger outerHtmlHead
        comment.outerHtmlTail(accum, 0, out);
    }

}