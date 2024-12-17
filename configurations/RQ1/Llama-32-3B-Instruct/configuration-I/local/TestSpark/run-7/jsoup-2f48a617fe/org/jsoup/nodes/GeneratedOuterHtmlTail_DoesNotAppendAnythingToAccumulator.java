package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_DoesNotAppendAnythingToAccumulator {

    @Test
    public void outerHtmlTail_DoesNotAppendAnythingToAccumulator() throws IOException {
        Appendable accum = mock(Appendable.class);
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, 0, Document.OutputSettings.DEFAULT);
        assertEquals(0, accum.length());
    }

}