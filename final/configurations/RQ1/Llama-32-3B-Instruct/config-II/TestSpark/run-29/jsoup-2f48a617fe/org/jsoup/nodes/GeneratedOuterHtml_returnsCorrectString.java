package org.jsoup.nodes;

public class GeneratedOuterHtml_returnsCorrectString {

    @Test
    public void outerHtml_returnsCorrectString() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        Comment comment = new Comment("Data");
        when(comment.outerHtmlHead(accum, depth, out)).thenReturn("");
        assertEquals("<!--Data-->", comment.outerHtml());
    }

}