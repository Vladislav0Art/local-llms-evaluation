package org.jsoup.nodes;

public class GeneratedOuterHtml_tail_isNotUsed {

    @Test
    public void outerHtml_tail_isNotUsed() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        Comment comment = new Comment("Data");
        when(comment.outerHtmlHead(accum, depth, out)).thenReturn("");
        comment.set parentNode (mock(Element.class));
        assertEquals("", accum.toString());
    }

}