package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_AppendsNothing {

    @Test
    public void outerHtmlTail_AppendsNothing() throws IOException {
        Comment comment = new Comment("");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);

        comment.outerHtmlHead(accum, 0, out);

        verify(accum).append(anyString());
    }

}